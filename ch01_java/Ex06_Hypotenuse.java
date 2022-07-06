import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex06_Hypotenuse
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double height, base, hypotenuse;

        System.out.println("Please enter the length of the base:");
        base = keyboard.nextDouble();
        System.out.println("Please enter the length of the height");
        height = keyboard.nextDouble();

        hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));

        System.out.println("Hypotenuse = " + df.format(hypotenuse));
    }//main
}//class