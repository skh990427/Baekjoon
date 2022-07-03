import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		int num = stdIn.nextInt();
		boolean prime[] = new boolean[1300000];
		
		prime[0] = prime[1] = true;
		
		for(int i = 2 ; i <= Math.sqrt(prime.length) ; i++)
		{
			if(prime[i]) continue;
			for(int j = i * i ; j < prime.length ; j += i)
			{
				prime[j] = true;
			}
		}
		
		int cnt = 0;
		
		for(int i = num ; i < prime.length ; i++)
		{
			if(!prime[i])
			{
				cnt = 0;
				for(int j = 0 ; j < String.valueOf(i).length() ; j++)
				{
					if(String.valueOf(i).charAt(j) == String.valueOf(i).charAt(String.valueOf(i).length() - (j + 1)))
					{
						cnt++;
					}
					else
					{
						break;
					}
				}
			}
			if(String.valueOf(i).length() == cnt)
			{
				System.out.println(i);
				break;
			}
		}
	}
}