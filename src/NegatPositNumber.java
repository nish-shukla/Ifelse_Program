import java.sql.SQLOutput;
import java.util.Scanner;

public class NegatPositNumber {
    public static void main(String[] args)
    {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number");
        number = scanner.nextInt();
        if (number>0)
        {
            System.out.println("This number is Positive");
        }else if (number<0)
        {
            System.out.println("Thsi number is Negative");
        }else
        {
            System.out.println("This number is Zero");
        }




    }



}
