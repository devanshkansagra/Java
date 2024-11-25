import java.util.*;

class fixManager {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        System.out.println("Get : " + n);
        valueSet = false;
        notify(); 
        return n;
    }

    synchronized void put(int n) {
        while (valueSet) { 
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("Put : " + n);
        notify(); 
    }
}

class fixProducer implements Runnable {
    fixManager m;
    Thread t;

    fixProducer(fixManager m) {
        this.m = m;
        t = new Thread(this, "Producer");
        t.start();
    }

    public void run() {
        int i = 0;
        while (true) {
            m.put(i++);
        }
    }
}

class fixConsumer implements Runnable {
    fixManager m;
    Thread t;

    fixConsumer(fixManager m) {
        this.m = m;
        t = new Thread(this, "Consumer");
        t.start();
    }

    public void run() {
        while (true) {
            m.get();
        }
    }
}

public class PCfixed {
    public static void main(String[] args) {
        fixManager m = new fixManager();

        new fixProducer(m);
        new fixConsumer(m);
    }
}