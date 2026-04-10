import java.util.Scanner;

class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Account Balance: ");
            double balance = sc.nextDouble();

            System.out.print("Enter Withdrawal Amount: ");
            double withdraw = sc.nextDouble();

            if (withdraw > balance) {
                throw new Exception("Insufficient Balance");
            }

            balance = balance - withdraw;

            System.out.println("Withdrawal successful.");
            System.out.println("Remaining balance: " + balance);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
