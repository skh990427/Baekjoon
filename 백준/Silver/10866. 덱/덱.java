import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> deque = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            String command = token.nextToken();

            if (command.equals("push_back")) {
                deque.addLast(Integer.parseInt(token.nextToken()));
            } else if (command.equals("push_front")) {
                deque.addFirst(Integer.parseInt(token.nextToken()));
            } else if (command.equals("pop_front")) {
                if (!deque.isEmpty()) {
                    System.out.println(deque.removeFirst());
                } else {
                    System.out.println(-1);
                }
            } else if (command.equals("pop_back")) {
                if (!deque.isEmpty()) {
                    System.out.println(deque.removeLast());
                } else {
                    System.out.println(-1);
                }
            } else if (command.equals("size")) {
                System.out.println(deque.size());
            } else if (command.equals("empty")) {
                if (deque.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (command.equals("front")) {
                if (!deque.isEmpty()) {
                    System.out.println(deque.peekFirst());
                } else {
                    System.out.println(-1);
                }
            } else if (command.equals("back")) {
                if (!deque.isEmpty()) {
                    System.out.println(deque.peekLast());
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
}
