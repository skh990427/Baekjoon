import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		
		boolean prime[] = new boolean[m+1];
		
		prime[0] = prime[1] = true;
		
		for(int i = 2 ; i <= Math.sqrt(prime.length) ; i++)
		{
			for(int j = i * i ; j < prime.length ; j += i)
			{
				prime[j] = true;
			}
		}
		
		for(int i = n ; i <= m ; i++)
		{
			if(!prime[i]) System.out.println(i);
		}
	}
}