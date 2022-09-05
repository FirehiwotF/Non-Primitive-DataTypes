import java.util.Scanner; // import the Scanner class

public class Conditional_With_Input {
        public static void main (String[] args){
        /* In Order to Take loan the following must be fulfilled :-
        the person must not have criminal record and must have good social score and
        the Saving account must be > 500000 or Salary > 70000
         */

            boolean hasCriminalRecord = false;
            boolean hasGoodSocialScore = true;

            Scanner MySalary = new Scanner(System.in);
            System.out.println("Please insert your Salary:-");

            float MonthlySalary = MySalary.nextFloat();  // Read user input
            System.out.println("User Salary is: " + MonthlySalary);  // Output user input

            Scanner MySaving = new Scanner(System.in);
            System.out.println("Please insert your total Saving amount:-");

            float Saving = MySaving.nextFloat();  // Read user input
            System.out.println("User Salary is: " + Saving);  // Output user input
            boolean SavingAccount=Saving > 500000;
            boolean Salary=MonthlySalary>70000;
            boolean CanTakeLoan = ((!hasCriminalRecord && hasGoodSocialScore) &&(SavingAccount || Salary));

            System.out.println("Therefore you can take loan.True or False => "+(CanTakeLoan));
        }
    }

