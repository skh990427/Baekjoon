import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		while(true)
		{
			int num = stdIn.nextInt();
			boolean prime[] = new boolean[num*2+1];
			if(num == 0)
				break;
			
			prime[0] = prime[1] = true;
			
			for(int i = 2 ; i < Math.sqrt(prime.length) ; i++)
			{
				if(prime[i]) continue;
				for(int j = i * i ; j < prime.length ; j += i)
				{
					prime[j] = true;
				}
			}
			int cnt = 0;
			for(int i = num+1 ; i <= num*2 ; i++)
			{
				if(!prime[i])
					cnt++;
			}
			System.out.println(cnt);
		}
	}
}