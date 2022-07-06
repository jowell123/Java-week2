import java.util.Scanner;

class Ex05_AverageCalculator
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String input;
        int numInput; 
        int count = 0;
        int total = 0;
        double average;

        System.out.println("Enter a number or press = :");
        input = keyboard.nextLine();

        while (!input.equals("="))
        {
            numInput = Integer.parseInt(input);
            total = total + numInput;
            count++;
            System.out.println("Enter a number or press = :");
            input = keyboard.nextLine();
        
        }//while

        average = (double)total / count;

        System.out.println("\nAnswer = " + average);

    }//main
}//class