import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		int d = stdIn.nextInt();
		
		int sum = a + b + c + d;
		int min = 0;
		while(sum >= 60)
		{
			sum -= 60;
			min++;
		}
		System.out.println(min);
		System.out.println(sum);
	}
}