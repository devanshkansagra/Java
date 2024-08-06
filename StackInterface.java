interface IntStack {
	void push(int d);
	int pop();
	void print();
}

class Stack implements IntStack {
	int size;
	int arr[];
	int top;

	Stack(int size) {
		this.size = size;
		arr = new int[size];
		top = -1;
	}

	public void push(int d) {
		if(top == size) {
			System.out.println("Stack overflow");
		}
		else {
			top += 1;
			arr[top] = d;
		}
	}

	public int pop() {
		int topEle = 0;
		if(top == -1) {
			System.out.print("Stack Underflow");
		}
		else {
			topEle = arr[top];
			top -= 1;
		}

		return topEle;
	}

	public void print() {
		for(int i = top; i > -1; i--) {
			System.out.println(arr[i]);
		}
	}
}

class StackInterface{
	public static void main(String[] args) {
		Stack st = new Stack(5);
		for(int i = 1; i <= 5; i++) {
			st.push(i);
		}

		st.print();
		System.out.println();
		int top = st.pop();
		st.print();
	}
}