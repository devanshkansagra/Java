class Q {
    int n;
    boolean valueSet = false;

    synchronized public int get() {
        if(!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Got: " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized public void put(int n) {
        if(valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        this.n = n;
        System.out.println("Put: " + n);
        valueSet = true;
        notify();
    }
}

class Producer implements Runnable {
    Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }
    public void run() {
        int i = 0;
        while(true) {
            q.put(i++);
        }
    }
}
class Consumer implements Runnable {
    Q q;
    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }
    public void run() {
        while (true) {
            q.get();
        }
    }
}
public class ProducerConsumer {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}
