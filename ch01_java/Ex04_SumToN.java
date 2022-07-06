import java.util.Scanner;

public class Ex04_SumToN {
 
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int max;
        int total = 0;

        System.out.println("Please enter a number to sum up to:");
        max = keyboard.nextInt();

        System.out.println("");
        for (int count = 1; count <= max; count++)
        {
            total = total + count;
            System.out.println(total);

        }//for

    }//main
}//class
