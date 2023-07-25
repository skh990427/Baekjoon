import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(token.nextToken());
        int m = Integer.parseInt(token.nextToken());
        int b = Integer.parseInt(token.nextToken());

        int low = 257;
        int high = -1;

        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            token = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(token.nextToken());
                if (arr[i][j] > high) {
                    high = arr[i][j];
                }
                if (arr[i][j] < low) {
                    low = arr[i][j];
                }
            }
        }

        int answerSecond = Integer.MAX_VALUE;
        int answerHeight = -1;

        for (int i = low; i <= high; i++) {
            int seconds = 0;
            int bag = b;

            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                    int diff = arr[j][k] - i;

                    if (diff > 0) {
                        seconds += Math.abs(diff) * 2;
                        bag += Math.abs(diff);
                    } else if (diff < 0) {
                        seconds += Math.abs(diff);
                        bag -= Math.abs(diff);
                    }
                }
            }

            if (bag >= 0) {
                if (seconds <= answerSecond) {
                    answerSecond = seconds;
                    answerHeight = i;
                }
            }
        }

        System.out.println(answerSecond + " " + answerHeight);
    }
}
