import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        for (int i = 0; i < n; i++)
        {
            int sum = 0;
            int cnt = 0;
            String str = stdIn.next();
            for (int j = 0; j < str.length(); j++)
            {
                if(str.charAt(j) == 'O')
                {
                    cnt++;
                    sum += cnt;
                }
                else {
                    cnt = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
