import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		Map<Integer, Integer> score = new HashMap<Integer, Integer>();
		Integer arr[] = new Integer[8];
		
		for(int i = 1 ; i <= 8 ; i++)
		{
			int num = stdIn.nextInt();
			score.put(i, num);
			arr[i-1] = num;
		}
		Arrays.sort(arr, Collections.reverseOrder());
		
		int sum = 0;
		int keyarr[] = new int[5];
		for(int i = 0 ; i < 5 ; i++)
		{
			for(int j = 0 ; j < 8 ; j++)
			{
				if(arr[i].equals(score.get(j+1)))
				{
					sum += score.get(j+1);
					keyarr[i] = j+1;
				}
			}
		}
		System.out.println(sum);
		
		Arrays.sort(keyarr);
		for(int i = 0 ; i < 4 ; i++)
		{
			System.out.print(keyarr[i] + " ");
		}
		System.out.println(keyarr[4]);
	}
}