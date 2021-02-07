package ThirdLesson;

/**
 * @author Dmitry Kubyshkin
 * @dateOfCreation 07.02.2021
 */

public class DZFirst {
    public static void main(String[] args) throws InterruptedException {
        Object monitor = new Object();
        while (true) {
            Thread thread1 = new PrintThread("ping");
            Thread thread2 = new PrintThread("pong");
            thread1.start();
            thread1.join();
            thread2.start();
            thread2.join();
        }
    }
}

class PrintThread extends Thread {
    public PrintThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName());
    }
}

/* Вывод:
    ping
    pong
    ping
    pong
    ping
    pong
    ping
    pong
    ping
    pong
    ping
    pong
    ....
*/
