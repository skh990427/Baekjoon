import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int searchN = 1;
        int count = 0;
        while (true) {
            if (n <= searchN) {
                count++;
                break;
            } else {
                count++;
                searchN += count * 6;
            }
        }
        System.out.println(count);

    }
}
