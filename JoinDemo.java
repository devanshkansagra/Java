class NewThread implements Runnable {
    String name;
    Thread t;

    NewThread (String name) {
        this.name = name;
        t = new Thread(this, name);
        System.out.println("New Thread: " + t);
        t.start();
    }

    public void run() {
        try {
            for(int i = 1; i <= 5; i++) {
                System.out.println("Name: " + name + ", " + i + "\n");
                t.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
public class JoinDemo {
    public static void main(String[] args) {
        NewThread n1 = new NewThread("First");
        NewThread n2 = new NewThread("Second");
        NewThread n3 = new NewThread("Third");

        System.out.println("Join Demo");
        try {
            n1.t.join();
            n2.t.join();
            n3.t.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
