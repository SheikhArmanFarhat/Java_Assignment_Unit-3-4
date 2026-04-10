class Problem17 implements Runnable {

    String fileName;

    Problem17(String name) {
        fileName = name;
    }

    public void run() {
        System.out.println("Downloading " + fileName);
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new Problem17("File1"));
        Thread t2 = new Thread(new Problem17("File2"));
        Thread t3 = new Thread(new Problem17("File3"));

        t1.start();
        t2.start();
        t3.start();
    }
}
