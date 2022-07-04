import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int sum = 0;
		
		String num = stdIn.next();
		
		for(int i = 0 ; i < num.length() ; i++)
		{
			sum += num.charAt(i) - 48;
		}
		
		System.out.println(sum);
	}
}