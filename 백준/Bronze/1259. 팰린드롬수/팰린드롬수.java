import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		while(true)
		{
			String num = stdIn.next();
			int cnt = 0;
			if(num.equals("0"))
				break;
			
			for(int i = 0 ; i < num.length() ; i++)
			{
				if(num.charAt(i) != num.charAt(num.length()-(i+1)))
				{
					System.out.println("no");
					break;
				}
				cnt++;
			}
			if(cnt == num.length())
				System.out.println("yes");
		}
	}
}