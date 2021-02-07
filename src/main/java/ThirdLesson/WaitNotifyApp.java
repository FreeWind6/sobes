package ThirdLesson;

/**
 * Взял идею из вашего проекта
 */
public class WaitNotifyApp {
    private final Object mon = new Object();
    private String currentLetter = "ping";

    public static void main(String[] args) {
        WaitNotifyApp waitNotifyApp = new WaitNotifyApp();
        new Thread(() -> {
            waitNotifyApp.printPing();
        }).start();
        new Thread(() -> {
            waitNotifyApp.printPong();
        }).start();
    }

    public void printPing() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (!currentLetter.equals("ping")) {
                        mon.wait();
                    }
                    System.out.println("ping");
                    currentLetter = "pong";
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printPong() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (!currentLetter.equals("pong")) {
                        mon.wait();
                    }
                    System.out.println("pong");
                    currentLetter = "ping";
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
