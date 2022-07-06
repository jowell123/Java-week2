
import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Jolene Weller on 04/07/2022
 * Write a program which accepts 7 numbers and determines the lowest and highest number.
 * You should store the numbers in a list.
 * Each time the user enters a number, append it to the list.
 * Once you have all seven numbers print out the max number, then the min number.
 **/
public class HighestAndLowest
{

   public static void main(String[] args)
   {
      final int LISTSIZE = 7;

      Scanner keyboard = new Scanner(System.in);
      LinkedList<Integer> list = new LinkedList<>();

      for (int count = 0; count < LISTSIZE; count++)
      {
         System.out.println("Please enter number " + (count + 1) + " of " + LISTSIZE + ":");
         int num = keyboard.nextInt();
         list.add(num);
      }//for

      Iterator<Integer>iterator = list.listIterator();

      int min = list.get(0);
      int max = list.get(0);
      int count = 1;
      while ((iterator.hasNext()) && (count < 7))
      {
         if (list.get(count) < min)
         {
            min = list.get(count);
         }//if
         else if (list.get(count) > max)
         {
            max = list.get(count);
         }//if
         count++;
      }//while

      System.out.println("The minimum value is " + min);
      System.out.println("The maximum value is " + max);


   }//main 
}//class