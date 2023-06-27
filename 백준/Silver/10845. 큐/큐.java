import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int last = 0;

        for (int i = 0; i < n; i++) {
           StringTokenizer token = new StringTokenizer(br.readLine());
            String command = token.nextToken();

            if (command.equals("push"))
            {
                last = Integer.parseInt(token.nextToken());
                queue.add(last);

            }
            
            else if (command.equals("front"))
            {
                if (!queue.isEmpty()) {
                    System.out.println(queue.peek());
                } else {
                    System.out.println(-1);
                }
            }
            
            else if (command.equals("back"))
            {
                if (!queue.isEmpty()) {
                    System.out.println(last);
                } else {
                    System.out.println(-1);
                }
            }
            else if (command.equals("empty"))
            {
                if (queue.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
            else if (command.equals("size")) {
                System.out.println(queue.size());
            } else if (command.equals("pop")) {
                if (!queue.isEmpty()) {
                    System.out.println(queue.remove());
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
}
