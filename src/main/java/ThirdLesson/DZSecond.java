package ThirdLesson;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Dmitry Kubyshkin
 * @dateOfCreation 07.02.2021
 */

public class DZSecond {
    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();
        ReentrantLock locker = new ReentrantLock();
        for (int i = 1; i < 6; i++) {
            Thread t = new Thread(new CountThread(commonResource, locker));
            t.setName("Thread " + i);
            t.start();
        }
    }
}

class CommonResource {
    int x = 0;
}

class CountThread implements Runnable {
    CommonResource res;
    ReentrantLock locker;

    CountThread(CommonResource res, ReentrantLock lock) {
        this.res = res;
        locker = lock;
    }

    public void run() {
        locker.lock();
        try {
            res.x = 1;
            for (int i = 1; i < 5; i++) {
                System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
                res.x++;
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            locker.unlock();
        }
    }
}

/*      Вывод:
        Thread 1 1
        Thread 1 2
        Thread 1 3
        Thread 1 4
        Thread 2 1
        Thread 2 2
        Thread 2 3
        Thread 2 4
        Thread 3 1
        Thread 3 2
        Thread 3 3
        Thread 3 4
        Thread 4 1
        Thread 4 2
        Thread 4 3
        Thread 4 4
        Thread 5 1
        Thread 5 2
        Thread 5 3
        Thread 5 4
        */
