import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner keyboard = new Scanner(System.in);
       
        int rank;

        ArrayList<Movie> movie = new ArrayList<Movie>();

        movie.add(new Movie(1, "MARCEL THE SHELL WITH SHOES ON", "Dean Fleischer-Camp", 100));
        movie.add(new Movie(2, "FIRE OF LOVE", "Sara Dosa", 100));
        movie.add(new Movie(3, "PLAYGROUND", "Laura Wandel", 100));
        movie.add(new Movie(4, "WRITING WITH FIRE", "Rintu Thomas", 100));
        movie.add(new Movie(5, "THE JANES", "Tia Lessin", 100));
        movie.add(new Movie(6, "HAPPENING", "Audrey Diwan", 99));
        movie.add(new Movie(7, "NAVALNY", "Daniel Roher", 99));
        movie.add(new Movie(8, "POLY STYRENE: I AM A CLICHÉ", "Celeste Bell", 98));
        movie.add(new Movie(9, "THE AUTOMAT", "Lisa Hurwitz", 98));
        movie.add(new Movie(10, "WHO WE ARE: A CHRONICLE OF RACISM IN AMERICA", "Emily Kunstler", 98));

        System.out.println("Hey movie-goer, what position of movie would you like to find out about?");
        rank = keyboard.nextInt();
        keyboard.nextLine();

        Movie movie1 = movie.get(rank + 1);

        System.out.println(movie1.toString());

        /*String response = scanner.nextLine();
        Integer selectedMovie = Integer.parseInt(response);

        for(Movie movie:movieList){
            if(movie.rank == selectedMovie){
                System.out.println("You selected >>> " + movie.title + " by " + movie.director);
            }*/
    }
}
