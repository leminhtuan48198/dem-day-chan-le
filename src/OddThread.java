public class OddThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
