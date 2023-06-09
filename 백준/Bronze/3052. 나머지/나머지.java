import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        Scanner stdIn = new Scanner(System.in);

        for (int i = 0; i < 10; i++)
        {
            int num = stdIn.nextInt() % 42;
            if(arr.contains(num))
            {
                continue;
            }
            else
            {
                arr.add(num);
            }
        }

        System.out.println(arr.size());
    }
}
