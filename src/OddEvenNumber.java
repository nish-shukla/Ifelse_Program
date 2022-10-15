public class OddEvenNumber {
    public static void number(int a) {
        if ((a & 1) == 0) // Use of Turnery Operator
        {
            System.out.println("Given number is Even");
        } else {
            System.out.println("Given number is Odd");
        }
    }

    // Passing parameters
    public static void main(String[] args) {
        number(15);
        number(20);
        number(27);
    }
}