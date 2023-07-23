import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            boolean flag = true;
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();
            if (str.equals(".")) {
                break;
            }

            for (int i = 0; i < str.length(); i++) {
                switch (str.charAt(i)) {
                    case '(':
                        stack.add(str.charAt(i));
                        break;
                    case ')':
                        if (stack.isEmpty()) {
                            flag = false;
                            break;
                        }
                        if (stack.peek() == '(') {
                            stack.pop();
                        } else {
                            flag = false;
                        }
                        break;

                    case '[':
                        stack.add(str.charAt(i));
                        break;
                    case ']':
                        if (stack.isEmpty()) {
                            flag = false;
                            break;
                        }

                        if (stack.peek() == '[') {
                            stack.pop();
                        } else {
                            flag = false;
                        }
                        break;
                    case '.':
                        if (stack.size() != 0) {
                            flag = false;
                        }
                        break;
                    default:
                        break;
                }
            }
            if (flag) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
