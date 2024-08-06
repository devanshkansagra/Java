/*
	create a superclass called Figure that stores the dimensions of various
	two-dimensional objects. It also defines a method called area( ) that computes the area
	of an object. The program derives two subclasses from Figure. The first is Rectangle
	and the second is Triangle. Each of these subclasses overrides area( ) so that it returns
	the area of a rectangle and a triangle, respectively.

	Note: In Method overriding the return type of the method should also be the same.
*/

class Figure {
	double d1;
	double d2;

	Figure(int d1, int d2) {
		this.d1 = d1;
		this.d2 = d2;
	}

	double area() {
		System.out.println("Area is undefined");
		return 0.0;
	}
}

class Rectangle extends Figure {
	Rectangle(int l, int b) {
		super(l, b);
	}

	double area() {
		return d1 * d2;
	}
}

class Triangle extends Figure {
	Triangle(int b, int h) {
		super(b, h);
	}

	double area() {
		return (0.5) * d1 * d2;
	}
}
class Demo {
	public static void main(String args[]) {
		Figure f = new Figure(1, 2);
		f.area();

		Rectangle r = new Rectangle(2, 4);
		double r1 = r.area();
		System.out.println(r1);

		Triangle t = new Triangle(5, 6);
		double t1 = t.area();
		System.out.println(t1);
	}
}