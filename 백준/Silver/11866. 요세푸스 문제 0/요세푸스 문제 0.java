import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer token = new StringTokenizer(br.readLine());

        int people = Integer.parseInt(token.nextToken());
        int count = Integer.parseInt(token.nextToken());
        
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= people; i++) {
            queue.add(i);
        }

        sb.append('<');

        while (!queue.isEmpty()) {
            for (int i = 0; i < count-1; i++) {
                queue.add(queue.remove());
            }

            if (queue.size() == 1) {
                sb.append(queue.remove());
            } else {
                sb.append(queue.remove()).append(", ");
            }
        }

        sb.append('>');

        System.out.println(sb.toString());




    }
}
