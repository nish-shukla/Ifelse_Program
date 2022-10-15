public class StudentMarksheet
{
    static int total;
    static double percentage;
    public static void studentMarks(String name, int roll_No, int maths, int sci, int eng)
    {
        total = maths + sci + eng;
        percentage = total / 3;
        if (percentage >= 80)
        {
            System.out.println("This Student grade is A+ ");
        } else if  (percentage >=60)
        {
            System.out.println("This student grade is A " );
        } else if (percentage >=50)
        {
            System.out.println("This student grade is B ");
        } else if (percentage >=35) {
            System.out.println( "This student grade is C ");
        } else
        {
            System.out.println("This student is fail");
        }
        System.out.println("Student Name is " + name + " Roll No. " + roll_No + " and  Total marks = " + total + " and percentage is " + percentage);
    }

    public static void main(String args[])
    {
        studentMarks("Nishant", 8, 10, 20, 30);
        studentMarks("Mishva", 5, 60, 60, 70);
        studentMarks("Milap", 24, 70, 80, 90);
    }
}


