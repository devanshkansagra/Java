class InvalidDetailsException extends Exception {
    String msg;
    InvalidDetailsException(String msg) {
        this.msg = msg;
    }
    public String toString() {
        return "InvalidDetailsException: "+msg; 
    }
}
class IncomeTax {
    String Customer_name;
    String PAN_NO;
    int Salary;

    IncomeTax(String Customer_name, String PAN_NO, int Salary) {
        this.Customer_name = Customer_name;
        this.PAN_NO = PAN_NO;
        this.Salary = Salary;
    }

    public void seeDetails() throws InvalidDetailsException {
        if(Salary < 500000 && PAN_NO.endsWith("12L")) {
            throw new InvalidDetailsException("Your salary is less than 500000 and You have 12L at the end of PAN Number");
        }
        else {
            System.out.println("Name: " + Customer_name);
            System.out.println("PAN Number: " + PAN_NO);
            System.out.println("Salary: " + Salary);
        }
    }
}
class CustomExceptions {
    public static void main(String args[]) {
        IncomeTax i1 = new IncomeTax("ABC", "ABCD1243F", 6000000);
        IncomeTax i2 = new IncomeTax("XYZ", "ABCD1212L", 400000);

        try {
            i1.seeDetails();
            i2.seeDetails();
        } catch (InvalidDetailsException e) {
            System.out.println(e);
        }

    }
}
