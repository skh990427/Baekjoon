import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		
		int total = a * b * c;
		for(int i = 0 ; i < 10 ; i++)
		{
			int cnt = 0;
			for(int j = 0 ; j < String.valueOf(total).length() ; j++)
			{
				if(String.valueOf(total).charAt(j) == String.valueOf(i).charAt(0))
				{
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}