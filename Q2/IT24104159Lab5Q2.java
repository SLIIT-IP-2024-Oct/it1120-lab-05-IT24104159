import java.util.Scanner;

public class IT24104159Lab5Q2
{
	public static void main(String[]args)
	{
		Scanner scn = new Scanner(System.in);

		System.out.print("enter a number of new members introduced: ");
		int count = scn.nextInt();
		
		String x;
		switch(count) {
			case 0:
				x = "no prize";
				break;

			case 1:
				x = "Pen";
				break;
	
			case 2:
				x = "Umbrella";
				break;
		
			case 3:
				x = "Bag";
				break;

			case 4:
				x = "Travelling Chair";
				break;
			
			default:
				x = "Headphone";
				break;
			}

		System.out.print("Your prize is " + x);
	}
}