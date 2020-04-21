import java.util.Scanner;

public class PrintGrades
{
    public static void main(String[] args)
    {
        /*
        Design a while loop that operates at the
        behest of the user. Prompt the user to input
        a test score. Use if or switch statements to
        assign the appropriate grade and/or message
        to the score and print those out.
         */
        Scanner scn = new Scanner(System.in);
        System.out.println("Input a new score? y/n");
        String behest = scn.nextLine();
        while (behest.equalsIgnoreCase("y"))
        {
//            int test_score = 0;
//            boolean realNumber = true;
//            while (realNumber) {
//                System.out.println("Score: ");
//                if (scn.hasNextInt()){
//                    test_score = scn.nextInt();
//                    realNumber = false;
//                } else {
//                    System.out.println("Please enter a number");
//                    scn.nextLine();
//                }
//            }
            System.out.println("Score: ");
            int test_score = scn.nextInt();
            String grade;
            if (test_score > 96)
            {
                grade = "A+";
            }
            else if (test_score > 93)
            {
                grade = "A";
            }
            else if (test_score > 89)
            {
                grade = "A-";
            }
            else if (test_score > 86)
            {
                grade = "B+";
            }
            else if (test_score > 83)
            {
                grade = "B";
            }
            else if (test_score > 79)
            {
                grade = "B-";
            }
            else if (test_score > 76)
            {
                grade = "C+";
            }
            else if (test_score > 73)
            {
                grade = "C";
            }
            else if (test_score > 69)
            {
                grade = "C-";
            }
            else if (test_score > 59)
            {
                grade = "D";
            }
            else
            {
                grade = "Yikes kid! You need to hit \nthe books some more.";
            }
            System.out.println(grade);
            System.out.println("Input a new score? y/n");
            behest = scn.next();
        }
    }
}
