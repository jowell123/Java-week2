import java.util.Scanner;

public class Ex03_MultiplesOfThree
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int max;

        System.out.println("Please enter a number:");
        max = keyboard.nextInt();

        for (int count = 0; count < max; count+=3)
        {
            if ((count % 3 == 0) && (count > 0))
            {
                System.out.println(count);
            }//if
        }//for
    }//main
}//class