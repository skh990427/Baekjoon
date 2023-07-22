import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            //입력값이 count보다 크면
            if (num > count) {
                for (int j = count + 1; j <= num; j++) {
                    stack.add(j);
                    sb.append("+").append("\n");
                }
                count = num;
                //맨위값이 num값이 아니면 끝
            } else if (stack.peek() != num) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append("-").append("\n");
        }

        System.out.println(sb.toString());

    }
}
