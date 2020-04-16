import java.util.Scanner;

public class PassFail {
    public static void main (String [] args) {
        /**
         * This program is to determine if a student Pass or Fail
         * The user will enter the student score
         * If the score is more than 60, the student pass
         * if the score is less than 60, the student fail
         */
        Scanner in = new Scanner(System.in);
        int score;

        do{
            System.out.println("Enter a student's test score. Type -1 to quit.");
            score = in.nextInt();

            if (score >= 60)
                System.out.println("Student passed.");

            else
                System.out.println("Student failed.");

        } while (score != -1);
    }
}
