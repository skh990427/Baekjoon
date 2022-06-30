import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		int num = stdIn.nextInt();
		int H, W, N;
		
		for(int i = 0 ; i < num ; i++)
		{
			H = stdIn.nextInt();
			W = stdIn.nextInt();
			N = stdIn.nextInt();
			int count = 1;
			
			while(true)
			{
				if(N > H)
				{
					N = N - H;
					count++;
				}
				else break;
			}
			System.out.printf("%d%02d\n", N, count);
		}
	}
}