import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toLowerCase();

        int alphabet[] = new int[26];

        for (int i = 0; i < str.length(); i++) {
            alphabet[str.charAt(i) - 97]++;
        }

        int max = -1;
        char ch = '?';

        for (int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] > max)
            {
                max = alphabet[i];
                ch = (char) (i + 65);
            }
            else if(max == alphabet[i]){
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
