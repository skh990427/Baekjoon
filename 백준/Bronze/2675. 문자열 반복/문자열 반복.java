import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();

        for (int i = 0; i < n; i++) {
            int renum = stdIn.nextInt();
            String str = stdIn.next();
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < renum; k++) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
