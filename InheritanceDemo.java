class Base {
	private int a;
	private int b;

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}
	void print() {
		System.out.println(a + " " + b);
	}
}

class Derived extends Base {
	int c;

	public void setC(int c) {
		this.c = c;
	}
	void print() {
		System.out.println(a + " " + b + " "+ c);
	}
}
class InheritanceDemo {
	public static void main(String[] args) {
		Base b = new Base();
		Derived d = new Derived();

		b.setA(10);
		b.setB(20);

		b.print();

		d.setA(10);
		d.setB(20);
		d.setC(30);
		d.print();
	}
}