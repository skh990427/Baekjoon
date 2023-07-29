import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            LinkedList<Integer> arr = new LinkedList<>();
            if (num < 4) {
                arr.add(1);
                arr.add(2);
                arr.add(4);
            } else {
                arr.add(1);
                arr.add(2);
                arr.add(4);

                for (int j = 2; j < num - 1; j++) {
                    arr.add(arr.get(j - 2) + arr.get(j - 1) + arr.get(j));
                }
            }
            System.out.println(arr.get(num - 1));
        }
    }
}
