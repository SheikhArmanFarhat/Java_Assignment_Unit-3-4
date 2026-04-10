class Problem16 extends Thread {

    public void run() {
        try {
            System.out.println("Playing song...");

            for (int i = 1; i <= 3; i++) {
                System.out.println("Progress " + i);
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

    public static void main(String[] args) {
        Problem16 t = new Problem16();
        t.start();
    }
}
