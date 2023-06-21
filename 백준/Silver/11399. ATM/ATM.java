import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer token = new StringTokenizer(br.readLine());

        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr.add(Integer.valueOf(token.nextToken()));
        }
        Collections.sort(arr);

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                sum += arr.get(j);
            }
        }

        System.out.println(sum);
    }
}
