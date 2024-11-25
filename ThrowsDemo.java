class Demo {
    int a, b;
    char c;
    Demo(int a, int b, char c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calculate() throws ArithmeticException {
        switch (c) {
            case '+' : {
                System.out.println(a + b);
                break;
            }

            case '-' : {
                System.out.println(a - b);
                break;
            }

            case '/' : {
                System.out.println(a / b);
                break;
            }

            case '*' : {
                System.out.println(a * b);
                break;
            }

            default : {
                throw new ArithmeticException("Invalid Character");
            }
        }
    }
}
public class ThrowsDemo {
    public static void main(String[] args) {
        Demo d = new Demo(1, 0, 'c');
        try {
            d.calculate();

        } catch (ArithmeticException e) {
            System.err.println("Exception generated: " + e);
        }
    }
}
