class Problem20 extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
    }

    public static void main(String[] args) {

        Problem20 t1 = new Problem20();
        Problem20 t2 = new Problem20();
        Problem20 t3 = new Problem20();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.setName("Low Priority Thread");
        t2.setName("Normal Priority Thread");
        t3.setName("High Priority Thread");

        t1.start();
        t2.start();
        t3.start();
    }
}
