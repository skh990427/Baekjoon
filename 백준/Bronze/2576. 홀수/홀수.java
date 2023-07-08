import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n % 2 == 1) {
                arr.add(n);
            }
        }

        Collections.sort(arr);

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 1) {
                sum += arr.get(i);
            }
        }

        if (arr.size() > 0) {
            System.out.println(sum);
            System.out.println(arr.get(0));
        } else {
            System.out.println(-1);
        }
    }
}
