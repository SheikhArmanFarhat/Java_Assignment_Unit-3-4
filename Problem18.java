class Problem18 {

    int tickets = 1;

    synchronized void bookTicket() {
        if (tickets > 0) {
            System.out.println("Ticket booked successfully");
            tickets--;
        } else {
            System.out.println("No tickets available");
        }
    }

    public static void main(String[] args) {

        Problem18 obj = new Problem18();

        Thread t1 = new Thread(() -> obj.bookTicket());
        Thread t2 = new Thread(() -> obj.bookTicket());

        t1.start();
        t2.start();
    }
}
