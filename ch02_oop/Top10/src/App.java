import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        int position;

        Scanner keyboard = new Scanner(System.in);
        
        
        ArrayList<Song> top10 = new ArrayList<Song>();
        top10.add(new Song(1, "Running Up That Hill", "Kate Bush", "Fish People"));
        top10.add(new Song(2, "Afraid To Feel", "LF System", "Warmer Records"));
        top10.add(new Song(3, "As It Was", "Harry Styles", "Columbia"));
        top10.add(new Song(4, "Break My Soul", "Beyonce", "Columbia"));
        top10.add(new Song(5, "Green Green Grass", "George Ezra", "Columbia"));
        top10.add(new Song(6, "Go", "Cat Burns", "RCA/Since 93"));
        top10.add(new Song(7, "About Damn Time", "Lizzo", "Atlantic"));
        top10.add(new Song(8, "Massive", "Drake", "Ovo/Republic Records"));
        top10.add(new Song(9, "IFTK", "Tion Wayne & La Roux", "Atlantic"));
        top10.add(new Song(10, "Late Night Talking", "Harry Styles", "Columbia"));

        System.out.println("Enter a chart position:");
        position = keyboard.nextInt();
        keyboard.nextLine();

        Song userS = top10.get(position + 1);

        System.out.println(": " + userS.toString());

    
        

    }

}
