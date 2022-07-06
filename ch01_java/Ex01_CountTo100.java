public class Ex01_CountTo100 {
    public static void main(String[] args) {
        Integer num;

        for (int count = 0; count <= 100; count++)
        {
            System.out.println(count);
            if (count % 9 == 0)
            {
                System.out.println("Cats have nine lives");
            }//if
        }//for
    }
    
}
