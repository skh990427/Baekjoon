import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int arr[] = new int[5];
        int sum = 0;


        for (int i = 0; i < 5; i++) {
            sum += Math.pow(stdIn.nextInt(), 2);
        }
        System.out.println(sum % 10);

    }
}
