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
		
		System.out.println(arr[0] + " " + arr[n-1]);
	}
}