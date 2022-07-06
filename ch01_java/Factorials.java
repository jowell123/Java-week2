import java.util.Scanner;

/**
 * Created by Jolene Weller on 04/07/2022
 * Write a program (using loops) which can compute the factorial of a given number.
 **/
public class Factorials
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int max;
      int factorial = 1;
      System.out.println("Please enter a number:");
      max = keyboard.nextInt();

         for (int j = 1; j <= max; j++)
         {
            factorial = factorial * j;
         }//inner for

      System.out.println(max + "! = " + factorial);

   }//main 
}//class