import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int top = 1;
        int bot = 1;

        int n = Integer.parseInt(token.nextToken());
        int k = Integer.parseInt(token.nextToken());

        //nCk

        for (int i = 0; i < k; i++) {
            top *= n - i;
            bot *= i + 1;
        }

        System.out.println(top / bot);
    }
}
