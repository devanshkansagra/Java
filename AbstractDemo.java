abstract class Shape {
	double d1,d2;
	static final double pi = 3.14;
	Shape(double d1, double d2) {
		this.d1 = d1;
		this.d2 = d2;
	}
	abstract double area();
	abstract double perimeter();
}

class Square extends Shape {
	Square(double l) {
		super(l, l);
	}

	double area() {
		return d1 * d2;
	}

	double perimeter() {
		return d1 + d2;
	}
}

class Circle extends Shape {
	Circle(double r) {
		super(r, r);
	}
	double area() {
		return Shape.pi * d1 * d2;
	}

	double perimeter() {
		return 2.0 * Shape.pi * d1;
	}
}
class AbstractDemo {
	public static void main(String args[]) {

		// Shape sh = new Shape(1, 2);
		// sh.area();

		Square s = new Square(2);
		System.out.println(s.area());
		System.out.println(s.perimeter());

		Circle c = new Circle(2.5);
		System.out.println(c.area());
		System.out.println(c.perimeter());
	}
}