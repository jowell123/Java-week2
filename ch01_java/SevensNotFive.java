package Week2;

public class SevensNotFive
{

   public static void main(String[] args)
   {
      for (int count = 2000; count <= 3200; count++)
      {
         if ((count % 7 == 0) && (count % 5 != 0))
         {
            System.out.print(count + ", ");
         }//if
      }//for

   }//main 
}//class