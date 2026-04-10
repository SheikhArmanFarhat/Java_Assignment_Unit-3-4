class Problem21 {

    boolean foodReady = false;

    synchronized void prepareFood() {
        System.out.println("Chef prepared food");
        foodReady = true;
        notify();
    }

    synchronized void serveFood() {
        if (!foodReady) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Waiter served food");
    }

    public static void main(String[] args) {

        Problem21 obj = new Problem21();

        Thread chef = new Thread(() -> obj.prepareFood());
        Thread waiter = new Thread(() -> obj.serveFood());

        waiter.start();
        chef.start();
    }
}
