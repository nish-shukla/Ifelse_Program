import java.util.Scanner;

public class CharacterCompareSwitch {
    public static void main(String[] args)
    {
    String character;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter alphabet between A & F");
        character=scanner.next();
        switch (character)
        {
            case "a":
                System.out.println("Matching name of the City is Ahmedabad");
                break;
            case "b":
                System.out.println("Matching name of the City is Baroda");
                break;
            case "c":
                System.out.println("Matching name of the City is Chandigadh");
                break;
            case "d":
                System.out.println("Matching name of the City is Delhi");
                break;
            case "e":
                System.out.println("Matching name of the City is Edmonton Canada");
                break;
            case "f":
                System.out.println("Matching name of the City is Florence");
            default:
                    System.out.println("You have Entered invalid Character");
                return;
        }
    }
}
