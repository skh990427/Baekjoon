import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		int arr[][] = new int[9][1];
		
		for(int i = 0 ; i < 9 ; i++)
		{
			arr[i][0] = stdIn.nextInt();
		}
		
		int key = arr[0][0];
		
		for(int i = 0 ; i < 9 ; i++)
		{
			if(key < arr[i][0])
				key = arr[i][0];
		}
		for(int i = 0 ; i < 9 ; i++)
		{
			if(arr[i][0] == key)
			{
				System.out.println(arr[i][0]);
				System.out.println(i+1);
				break;
			}
		}
	}
}