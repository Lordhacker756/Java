import java.util.*;

class RandomNumberGenerator extends Thread {
    public void run() {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomInt = random.nextInt(100);
            System.out.println("Random Number Generated: " + randomInt);

            if (randomInt % 2 == 0) {
                SquareThread sq = new SquareThread(randomInt);
                sq.start();
            } else {
                CubeThread ct = new CubeThread(randomInt);
                ct.start();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) { // Corrected the class name
                System.out.println(ie);
            }
        }
    }
}

class SquareThread extends Thread {
    int n;

    SquareThread(int num) {
        this.n = num;
    }

    public void run() {
        System.out.println("Square of " + n + " is " + n * n);
    }
}

class CubeThread extends Thread {
    int n;

    CubeThread(int num) {
        this.n = num;
    }

    public void run() {
        System.out.println("Cube of " + n + " is " + n * n * n);
    }
}

public class ThreadsExample {
    public static void main(String args[]) {
        RandomNumberGenerator rn = new RandomNumberGenerator();
        rn.start();
    }
}
