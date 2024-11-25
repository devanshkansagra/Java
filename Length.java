class Length {
    private int meters;
    private int millimeters;

    public Length(int meters, int centimeters, int millimeters) {
        this.meters = meters;
        this.millimeters = centimeters * 10 + millimeters;
        normalize();
    }

    public Length(int meters) {
        this.meters = meters;
        this.millimeters = 0;
    }

    private void normalize() {
        if (millimeters >= 1000) {
            meters += millimeters / 1000;
            millimeters = millimeters % 1000;
        }
    }

    public Length add(Length other) {
        return new Length(this.meters + other.meters, 0, this.millimeters + other.millimeters);
    }

    public Length subtract(Length other) {
        int totalMillimeters = this.toMillimeters() - other.toMillimeters();
        return new Length(0, 0, totalMillimeters);
    }

    public Length multiply(int factor) {
        return new Length(0, 0, this.toMillimeters() * factor);
    }

    public Length divide(int divisor) {
        return new Length(0, 0, this.toMillimeters() / divisor);
    }

    public int calculateArea(Length other) {
        return this.toMillimeters() * other.toMillimeters();
    }

    public boolean compare(Length other) {
        return this.toMillimeters() == other.toMillimeters();
    }

    private int toMillimeters() {
        return meters * 1000 + millimeters;
    }

    public void display() {
        System.out.println(meters + " meters and " + millimeters + " millimeters");
    }

    public static void main(String[] args) {
        Length length1 = new Length(3, 40, 500);
        Length length2 = new Length(1, 60, 700);

        Length sum = length1.add(length2);
        sum.display();

        Length difference = length1.subtract(length2);
        difference.display();

        Length product = length1.multiply(3);
        product.display();

        Length quotient = length2.divide(2);
        quotient.display();

        int area = length1.calculateArea(length2);
        System.out.println("Area: " + area + " square millimeters");

        boolean isEqual = length1.compare(length2);
        System.out.println("Are lengths equal? " + isEqual);
    }
}
