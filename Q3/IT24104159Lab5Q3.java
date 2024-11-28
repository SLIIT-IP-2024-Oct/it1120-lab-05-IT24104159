import java.util.Scanner;
public class IT24104159Lab5Q3
{
	public static final int DAYCharge = 48000;
	public static final int DIS1 = 10;
	public static final int DIS2 = 20;
	
	public static void main(String[]args) 
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.print("enter start date (1-31): ");
		int startD = scn.nextInt();

		System.out.print("enter end date (1-31): ");
		int endD = scn.nextInt();
			
		//data validation 1
		if (startD > 31 || startD <= 0){
			System.out.print ("Days must be between 1 or 31");
			return;

		}

		if (endD > 31 || endD <= 0){
			System.out.print ("Days must be between 1 or 31 ");
			return;
		}

		//data validation 2
		if (startD > endD){
			System.out.print("Start date must be less than the end date");
			return;
		}

		//calculate the charge for room
		
		int noDays = (endD - startD);
		int totAmount;

		if (noDays >= 5) {
			totAmount = (DAYCharge * noDays);
			totAmount = (totAmount - totAmount * DIS1 / 100);
			System.out.print("Total Amount to be paid: " + totAmount);
		}

		else if (noDays > 3) {
			totAmount = (DAYCharge * noDays);
			totAmount = (totAmount - totAmount * DIS2 / 100);
			System.out.print("Total Amount to be paid: " + totAmount);
		}
		
		else {
			totAmount = (DAYCharge * noDays);
			System.out.print("Total Amount to be paid: " + totAmount);
		}

		
	}
}