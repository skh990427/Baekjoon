import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BigInteger sum = new BigInteger("1");
        int count = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum.multiply(BigInteger.valueOf(i));
        }
        
        for (int i = String.valueOf(sum).length() - 1; i >= 0; i--) {
            if (String.valueOf(sum).charAt(i) == '0') {
                count++;
            } else {
                System.out.println(count);
                break;
            }
        }
    }
}
