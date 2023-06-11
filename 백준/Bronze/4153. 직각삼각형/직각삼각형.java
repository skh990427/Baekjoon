import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr1[] = new int[3];
        Scanner stdIn = new Scanner(System.in);

        while(true)
        {
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = stdIn.nextInt();
            }

            if(arr1[0] == 0 && arr1[1] == 0 && arr1[2] == 0)
            {
                return;
            }
            Arrays.sort(arr1);

            if(((arr1[0] * arr1[0]) + (arr1[1] * arr1[1])) == (arr1[2] * arr1[2]))
            {
                System.out.println("right");
            }
            else
            {
                System.out.println("wrong");
            }
        }

    }
}
