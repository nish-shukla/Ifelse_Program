import java.util.Scanner;
public class LeapYearChecking {
    // Writing a program to find Leap year
    public static void main(String[] args)
    {
        // Scanner class initilisation
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter year");

        // Passing variable to scanner class
        int year = scanner.nextInt();
        if ( year%4 ==0) // if entered year is divided by 4
        {
            System.out.println("This is a LeapYear");
        }
        else
        {
            System.out.println("This is not a LeapYear");
        }
    }




}
