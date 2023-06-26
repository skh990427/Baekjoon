import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> arr = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            arr.add(i + 1);
        }

        while (true) {
            if (arr.size() > 1) {
                arr.remove();
                arr.add(arr.remove());
            } else {
                break;
            }
        }
        System.out.println(arr.peek());
    }
}
