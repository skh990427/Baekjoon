import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static char arr[][];

    public static int countCheck(int i, int j) {
        int endX = i + 8;
        int endY = j + 8;
        int count1 = 0;
        int count2 = 0;
        char CheckWord = 'W';

        for (int k = i; k < endX; k++) {
            for (int l = j; l < endY; l++) {
                if (arr[k][l] != CheckWord) {
                    count1++;
                }
                if (CheckWord == 'W') {
                    CheckWord = 'B';
                } else {
                    CheckWord = 'W';
                }
            }
            if (CheckWord == 'W') {
                CheckWord = 'B';
            } else {
                CheckWord = 'W';
            }
        }

        CheckWord = 'B';

        for (int k = i; k < endX; k++) {
            for (int l = j; l < endY; l++) {
                if (arr[k][l] != CheckWord) {
                    count2++;
                }
                if (CheckWord == 'W') {
                    CheckWord = 'B';
                } else {
                    CheckWord = 'W';
                }
            }
            if (CheckWord == 'W') {
                CheckWord = 'B';
            } else {
                CheckWord = 'W';
            }
        }

        if (count1 >= count2) {
            return count2;
        } else {
            return count1;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(token.nextToken());
        int m = Integer.parseInt(token.nextToken());
        int min = 64;

        arr = new char[n][m];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                int countCheck = countCheck(i, j);

                if (min > countCheck) {
                    min = countCheck;
                }
            }
        }
        System.out.println(min);
    }
}