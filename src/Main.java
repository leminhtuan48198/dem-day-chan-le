public class Main {
    public static void main(String[] args) {
        Thread even=new EvenThread();
        Thread odd =new OddThread();
        odd.start();
        try {
            odd.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        even.start();
    }
}
