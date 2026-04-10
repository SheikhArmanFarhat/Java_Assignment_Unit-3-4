class Problem22 {

    int balance = 1000;

    void withdraw(int amount) {
        synchronized (this) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Amount deducted: " + amount + " Remaining balance: " + balance);
            } else {
                System.out.println("Insufficient balance");
            }
        }
    }

    public static void main(String[] args) {

        Problem22 obj = new Problem22();

        Thread t1 = new Thread(() -> obj.withdraw(500));
        Thread t2 = new Thread(() -> obj.withdraw(700));

        t1.start();
        t2.start();
    }
}
