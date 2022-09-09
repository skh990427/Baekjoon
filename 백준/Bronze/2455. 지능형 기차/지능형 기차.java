import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		int people = 0;
		int max = 0;
		
		for(int i = 0 ; i < 4 ; i++)
		{
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			
			people = people - a;
			people = people + b;
			
			if(people > max)
				max = people;
		}
		
		System.out.println(max);
	}
}