import java.util.Scanner;
public class VoterAge {
    public static void main(String[] args)
    {
        int age;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your Age");
        age=scanner.nextInt();
        if (age <= 16) {
            System.out.println("Voter is not Eligble for Voting");
        } else
        {
            System.out.println("Voter is Eligible for Voting");
    }

    }
}
