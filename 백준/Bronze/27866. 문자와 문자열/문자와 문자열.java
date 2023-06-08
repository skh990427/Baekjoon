import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String str = stdIn.next();
        int n = stdIn.nextInt();

        System.out.println(str.charAt(n-1));
        
    }
}