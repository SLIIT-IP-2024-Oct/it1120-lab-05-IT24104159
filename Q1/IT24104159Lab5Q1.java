import java.util.Scanner;

public class IT24104159Lab5Q1
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter first int: ");
		int num1 = scn.nextInt();

		System.out.print("enter second int: ");
		int num2 = scn.nextInt();

		System.out.print("enter third int: ");
		int num3 = scn.nextInt();

System.out.println("user entered numbers are :" + num1 + ", " + num2 + "," + num3);

		int smallest = num1;
		int largest = num1;

		if (num2 < smallest){
			smallest = num2;
		}
		
		if (num3 <smallest){
			smallest = num3;
		}

		if (num2 > largest){
			largest = num2;
		}

		if (num3 > largest){
			largest = num3;
		}

		System.out.println("Smallest number is: " + smallest);
		System.out.println("Largest number is: " + largest);
	}
}