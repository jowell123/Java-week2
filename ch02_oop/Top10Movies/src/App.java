import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
       ArrayList<Movie> movieList = new ArrayList();

       int rank;

       movieList.add(new Movie(1, "Silly Film", "Steve",100));
       movieList.add(new Movie(2, "Jurassic Park", "Jim", 99));
       movieList.add(new Movie(3, "Minions", "Gru", 98));

       System.out.println("Please enter the rank of the movie:");
       rank = keyboard.nextInt();
       keyboard.nextLine();

       Movie answer = null;

      for(Movie query1:movieList)
      {
         if (query1.getMovieRank() == rank)
         {
            System.out.println(query1);
         }

         for(Movie query2:movieList)
         {
            if (query2.getTitle().equals("Silly Film"))
               System.out.println(query2);
         }

      }


   }//main 
}
