import java.util.Scanner;

public class IT24104159Lab6Q3
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int[] numbers = new int[1000];
        int count = 0;

        System.out.print("Enter positive numbers (terminate input with -99): ");
        while (true) {
            int input = scn.nextInt();

            if (input == -99) {
                break;
            }

            if (input > 0) { 
                if (count < numbers.length) {
                    numbers[count] = input;
                    count++;
                }
                else {
                    return;
                }
            } else {
                System.out.println("Please enter a positive integer or -99 to terminate:");
            }
        }

        // Calculate the sum of squares
        double sumOfSquares = 0;
        for (int i = 0; i < count; i++) {
            sumOfSquares += Math.pow(numbers[i], 2);
        }

        // Calculate the root mean square
        double rms = Math.sqrt(sumOfSquares / count);
        System.out.println("The root mean square is: " + rms);
    }
}