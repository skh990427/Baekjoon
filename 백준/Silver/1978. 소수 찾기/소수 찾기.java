import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		int num = stdIn.nextInt();
		int arr[] = new int[num];
		int cnt = 0;
		
		for(int i = 0 ; i < num ; i++)
		{
			arr[i] = stdIn.nextInt();
		}
		
		for(int i = 0 ; i < arr.length ; i++)
		{			
			for(int j = 2 ; j < arr[i] ; j++)
			{
				if(arr[i] % j == 0)
				{
					break;
				}
				if(arr[i]-1 == j)
				{
					cnt++;
				}
			}
			if(arr[i] == 2)
			{
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}