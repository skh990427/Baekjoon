import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int sum1 = 0;
        int sum2 = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            sum1 += Integer.parseInt(token.nextToken());
        }

        token = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            sum2 += Integer.parseInt(token.nextToken());
        }

        if (sum1 >= sum2) {
            System.out.println(sum1);
        } else {
            System.out.println(sum2);
        }
    }
}
