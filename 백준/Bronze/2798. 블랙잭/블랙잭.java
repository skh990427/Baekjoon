import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        int max = 0;


        int n = Integer.parseInt(token.nextToken());
        int check = Integer.parseInt(token.nextToken());

        token = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(token.nextToken()));
        }

        Collections.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < n-2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr.get(i) + arr.get(j) + arr.get(k) <= check) {
                        if (max <= arr.get(i) + arr.get(j) + arr.get(k)) {
                            max = arr.get(i) + arr.get(j) + arr.get(k);
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }
}
