import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		int num = stdIn.nextInt();
		for(int i = 0 ; i < num ; i++)
		{
			int sum = 0;
			int count = 0;
			int n = stdIn.nextInt();
			int[] arr = new int[n];
			for(int j = 0 ; j < n ; j++)
			{
				arr[j] = stdIn.nextInt();
				sum += arr[j];
			}
			double avg = (double)sum / n;
			for(int j = 0 ; j < n ; j++)
			{
				if(arr[j] > avg)
					count++;
			}
			System.out.printf("%.3f%%\n",((double)count/n)*100);
		}
	}
}