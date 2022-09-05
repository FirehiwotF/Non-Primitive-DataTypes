public class Conditional {
    public static void main (String[] args){
        /* In Order to Take loan the following must be fulfilled :-
        the person must not have criminal record and must have good social score and
        the Saving account must be > 500000 or Salary > 70000
         */
        float Saving = 1000000;
        float MonthlySalary= 50000;
        boolean SavingAccount=Saving > 500000;
        boolean Salary=MonthlySalary>70000;
        boolean hasCriminalRecord = false;
        boolean hasGoodSocialScore = true;
        boolean CanTakeLoan = ((!hasCriminalRecord && hasGoodSocialScore) &&(SavingAccount || Salary));

        System.out.println("The person can take loan. => "+(CanTakeLoan));
    }
}
