public class TestProgram {
    public static void main(String args[])
    {
        SavingsAccount account1 = new SavingsAccount(2000.00);
        SavingsAccount account2 = new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(0.04);

        System.out.println("Test 1: (Interest Rate: 4%)");
//        for (int i = 0; i < 12; i++){
//            System.out.printf("Savings Account 1 Balance: %.2f\n", account1.getSavingsBalance());
//            account1.SavingsAccount(account1.getSavingsBalance());
//            System.out.printf("Savings Account 2 Balance: %.2f\n", account2.getSavingsBalance());
//        }
        System.out.printf("Savings Account 1 Balance: %.2f\n", account1.getSavingsBalance());
        System.out.printf("Savings Account 2 Balance: %.2f\n", account2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.05);

        System.out.println("\nTest 2: (Interest Rate: 5%)");
        System.out.printf("Savings Account 1 Balance: %.2f\n", account1.getSavingsBalance());
        System.out.printf("Savings Account 2 Balance: %.2f\n", account2.getSavingsBalance());
    }
}
