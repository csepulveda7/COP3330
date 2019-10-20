public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double balance) {
        savingsBalance = balance;
    }

    public double calculateMonthlyInterest() {
        return (savingsBalance * annualInterestRate) / 12;
    }

    public static void modifyInterestRate(double rate) {
        annualInterestRate = rate;
    }


    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getSavingsBalance(){
        return savingsBalance + calculateMonthlyInterest();
    }

}


