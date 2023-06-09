import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int alphabet[] = new int[26];
        for (int i = 0; i < 26; i++) {
             alphabet[i] = -1;
        }

        Scanner stdIn = new Scanner(System.in);
        String str = stdIn.next();

        for (int i = 0; i < str.length(); i++) {
            if(alphabet[-97 + str.charAt(i)] == -1)
            {
                alphabet[-97 + str.charAt(i)] = i;
            }
        }

        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");

        }


    }
}
