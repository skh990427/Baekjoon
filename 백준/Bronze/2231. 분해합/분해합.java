import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int searchNum = Integer.parseInt(br.readLine());
        int count = 0;

        while (true) {
            int sum = count;
            for (int i = 0; i < String.valueOf(count).length(); i++) {
                sum += Character.getNumericValue(String.valueOf(count).charAt(i));
            }

            if (sum == searchNum) {
                break;
            } else {
                count++;
            }
            if (searchNum <= count) {
                count = 0;
                break;
            }
        }

        System.out.println(count);
    }
}
