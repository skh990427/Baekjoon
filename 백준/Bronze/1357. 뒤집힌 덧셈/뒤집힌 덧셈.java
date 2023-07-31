import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(br.readLine());

        String str1 = token.nextToken();
        String str2 = token.nextToken();

        String str3 = "";
        String str4 = "";

        for (int i = str1.length() - 1; i >= 0 ; i--) {
            str3 += str1.charAt(i);
        }

        for (int i = str2.length() - 1; i >= 0 ; i--) {
            str4 += str2.charAt(i);
        }
        int count = Integer.parseInt(str3) + Integer.parseInt(str4);
        String result = "";

        for (int i = String.valueOf(count).length() - 1; i >= 0 ; i--) {
            result += String.valueOf(count).charAt(i);
        }

        System.out.println(Integer.parseInt(result));
    }
}
