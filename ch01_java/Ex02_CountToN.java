import java.util.Scanner;
class EX02_CountToN
{
public static void main(String[] args) {
    int number;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please enter an integer:");
    number = keyboard.nextInt();
    keyboard.nextLine();

    System.out.println("");
    
    for (int count = 0; count <= number; count++)
    {
        System.out.println(count);
        if (count % 9 == 0)
        {
            System.out.println("Cats have nine lives");
        }//if
    }//for
}
}