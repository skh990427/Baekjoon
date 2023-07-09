import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            int sum = 0;
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            for (int j = 0; j < n; j++) {
                arr.add(j + 1);
            }

            for (int j = 1; j < k; j++) {
                int length = arr.size();
                int count = 0;
                for (int l = 0; l < length; l++) {
                    int addsum = 0;
                    count++;
                    for (int m = 0; m < count; m++) {
                        addsum += arr.get(m);
                    }
                    arr.add(addsum);
                }

                for (int l = 0; l < length; l++) {
                    arr.remove(0);
                }
            }
            for (int j = 0; j < n; j++) {
                sum += arr.get(j);
            }

            System.out.println(sum);

        }
    }
}
