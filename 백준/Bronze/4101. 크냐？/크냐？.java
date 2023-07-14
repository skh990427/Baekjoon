import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int x;
            int y;
            StringTokenizer token = new StringTokenizer(br.readLine());

            x = Integer.parseInt(token.nextToken());
            y = Integer.parseInt(token.nextToken());

            if (x == 0 && y == 0) {
                break;
            }
            
            if (x > y) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
