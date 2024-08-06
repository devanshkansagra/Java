interface Shape {
	double area();
	double perimeter();
}

class Square implements Shape {
	double l;
	Square(double l) {
		this.l = l;
	}

	public double area() {
		return l * l;
	}

	public double perimeter() {
		return l + l;
	}

}
class InterfaceDemo {
	public static void main(String[] args) {
		Square s = new Square(2.250);
		System.out.println(s.area());
		System.out.println(s.perimeter());
	}
}