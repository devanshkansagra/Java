class NestedExceptionDemo {
    public static void main(String args[]) {
        try {
            if (args.length == 0) {
                throw new ArrayIndexOutOfBoundsException("Empty arguments");
            }
            else {
                try {
                    int a = Integer.parseInt(args[0]);
                    int b = Integer.parseInt(args[1]);
                    if(b == 0) {
                        throw new ArithmeticException("Divide by zero");
                    }
                    else {
                        int div = a / b;
                        System.out.println(div);
                    }
                } catch (ArithmeticException ae) {
                    System.out.println(ae);
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException aebe) {
            System.out.println(aebe);
        }
    }    
}
