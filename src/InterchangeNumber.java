public class InterchangeNumber
{
    public static void main(String[] args) {
        int a=10;
        int b=20;

        a = a+b; // a will become 30
        b = a-b; // b will become 10
        a = a-b; // a will become 20

        System.out.println("A value is " + a);
        System.out.println("B value is " + b);
    }
}
