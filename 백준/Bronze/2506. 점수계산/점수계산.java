import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        int count = 1;

        StringTokenizer token = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr.add(Integer.valueOf(token.nextToken()));
        }

        if (arr.get(0) == 1) {
            sum += count;
        }

        for (int i = 1; i < n; i++) {
            if (arr.get(i) == 1 && arr.get(i - 1) == 1) {
                count++;
                sum += count;
            } else if (arr.get(i) == 1) {
                sum += count;
            } else {
                count = 1;
            }
        }

        System.out.println(sum);

    }
}
