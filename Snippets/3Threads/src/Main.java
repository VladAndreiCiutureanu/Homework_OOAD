public class Main {
    public static void main(String[] args) {
        RandomNumberThread thread1 = new RandomNumberThread(1);
        RandomNumberThread thread2 = new RandomNumberThread(4);
        RandomNumberThread thread3 = new RandomNumberThread(3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}