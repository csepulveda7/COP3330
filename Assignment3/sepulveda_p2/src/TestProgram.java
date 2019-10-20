public class TestProgram {
    public static void main(String args[])
    {
        double x;
        double y;
        SavingsAccount account1 = new SavingsAccount(2000.00);
        SavingsAccount account2 = new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(0.04);
        x = account1.getSavingsBalance();
        y = account2.getSavingsBalance();

        System.out.println("Test 1: (Interest Rate: 4%)\n");
        for (int i = 1; i <= 12; i++){
            System.out.println("Month " + i + ":");
            System.out.printf("Savings Account 1 Balance: %.2f\n", x);
            System.out.printf("Savings Account 2 Balance: %.2f\n\n", y);
            x += account1.calculateMonthlyInterest();
            y += account2.calculateMonthlyInterest();
        }
//        System.out.printf("Savings Account 1 Balance: %.2f\n", account1.getSavingsBalance());
//        System.out.printf("Savings Account 2 Balance: %.2f\n", account2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.05);

        System.out.println("\nTest 2: (Interest Rate: 5%)\n");
        System.out.printf("Savings Account 1 Balance: %.2f\n", account1.getSavingsBalance());
        System.out.printf("Savings Account 2 Balance: %.2f\n", account2.getSavingsBalance());
    }
}
