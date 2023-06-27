import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String command = br.readLine();
            if (command.length() % 2 == 0) {
                int check = 0;
                for (int j = 0; j < command.length(); j++) {
                    if (command.charAt(j) == '(') {
                        check++;
                    } else if(command.charAt(j) == ')'){
                        check--;
                        if (check < 0) {
                            System.out.println("NO");
                            break;
                        }
                    }
                    if (j == command.length()-1 && check == 0) {
                        System.out.println("YES");
                    } else if (j == command.length() - 1 && check != 0) {
                        System.out.println("NO");
                    }
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}
