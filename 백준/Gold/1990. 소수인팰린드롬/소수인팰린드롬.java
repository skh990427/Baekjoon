import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		boolean prime[] = new boolean[b+1];
		
		prime[0] = prime[1] = true;
		
		for(int i = 2 ; i < Math.sqrt(prime.length) ; i++)
		{
			if(prime[i]) continue;
			for(int j = i * i ; j < prime.length ; j += i)
			{
				prime[j] = true;
			}
		}
		for(int i = a ; i <= b ; i++)
		{
			if(!prime[i])
			{
				int cnt = 0;
				for(int j = 0 ; j < String.valueOf(i).length() ; j++)
				{
					if(String.valueOf(i).charAt(j) == String.valueOf(i).charAt(String.valueOf(i).length() - (j+1)))
						cnt++;
					else
						break;
				}
				if(cnt == String.valueOf(i).length())
					System.out.println(i);
			}
		}
		System.out.println("-1");
	}
}