import java.util.Random;

class NumberThread extends Thread {
    private int num;

    public NumberThread(int num) {
        this.num = num;
    }

    public void run() {
        if (num % 2 == 0) {
            System.out.println("The random number is " + num + ":");
            for (int i = num - 2; i >= 2; i -= 2) {
                System.out.println(i);
            }
        } else {
            System.out.println("The random number is " + num + ":");
            for (int i = num - 2; i >= 1; i -= 2) {
                System.out.println(i);
            }
        }
    }
}

class RandomThread extends Thread {
    public void run() {
        Random r = new Random();
        int num = r.nextInt(100) + 1; // Generate random number between 1 and 100
        new NumberThread(num).start();
    }
}

public class Threadnew {
    public static void main(String[] args) {
        RandomThread r = new RandomThread();
        r.start();
    }
}
