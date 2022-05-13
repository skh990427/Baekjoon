import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0 ; i < n ; i++)
		{
			arr[i] = stdIn.nextInt();
		}
		
		Arrays.sort(arr);
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
