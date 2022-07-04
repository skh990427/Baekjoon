import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		int num = stdIn.nextInt();
		int arr[] = new int[num];
		double sum = 0;
		
		for(int i = 0 ; i < num ; i++)
		{
			arr[i] = stdIn.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i = 0 ; i < num ; i++)
		{
			sum += (double)arr[i]/arr[arr.length-1]*100;
		}
		
		System.out.println(sum / num);
	}
}