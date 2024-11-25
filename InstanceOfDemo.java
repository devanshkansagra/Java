class A {
    void greet() {
        System.out.println("Hello world");
    }
}

class B extends A {
    void bye() {
        System.out.println("Bye");
    }
}

public class InstanceOfDemo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        if(b instanceof A) {
            System.out.println("A is the instance of b");
        }
    }
}
