class OverloadingDemo {
    private int num1;
    private int num2;

    public OverloadingDemo() {
        this.num1 = 0;
        this.num2 = 0;
    }

    public OverloadingDemo(int num1) {
        this.num1 = num1;
        this.num2 = 0;
    }

    public OverloadingDemo(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        return num1 + num2;
    }

    public int add(int a) {
        return num1 + num2 + a;
    }

    public int add(int a, int b) {
        return num1 + num2 + a + b;
    }

    public static void main(String[] args) {
        OverloadingDemo obj1 = new OverloadingDemo();
        OverloadingDemo obj2 = new OverloadingDemo(5);
        OverloadingDemo obj3 = new OverloadingDemo(5, 10);

        System.out.println("Addition (obj1): " + obj1.add());
        System.out.println("Addition (obj2): " + obj2.add());
        System.out.println("Addition (obj3): " + obj3.add());
        System.out.println("Addition with one parameter: " + obj3.add(5));
        System.out.println("Addition with two parameters: " + obj3.add(5, 10));
    }
}
