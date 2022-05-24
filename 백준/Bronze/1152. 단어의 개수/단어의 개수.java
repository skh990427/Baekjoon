import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		String a = stdIn.nextLine();
		int cnt = 0;
		
		if(a.charAt(0) == ' ')
			cnt--;
		if(a.charAt(a.length()-1) == ' ')
			cnt--;
		
		for(int i = 0 ; i < a.length(); i++)
		{
			if(a.charAt(i) == ' ')
				cnt++;
		}
		
		System.out.println(cnt + 1);
	}
}