class Stack {
	int top;
	int arr[];
	int size;

	Stack(int size) {
		this.size = size;
		arr = new int[size];
		top = -1;
	}

	void push(int data) {
		if(top != size) {
			top += 1;
			arr[top] = data;
		}
		else {
			System.out.println("Stack overflow");
		}
	} 

	int pop() {
		if(top == -1) {
			System.out.println("Stack Underflow");
		}
		int temp = arr[top];
		top -= 1;
		return temp;
	}

	void print() {
		for(int i = top; i > -1; i--) {
			System.out.println(arr[i]);
		}
	}
}
class StackDemo {
	public static void main(String args[]) {
		Stack st = new Stack(5);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);

		st.print();
		System.out.println();
		int topEle = st.pop();
		System.out.println(topEle);
		System.out.println();
		st.print();

		int topEle2 = st.pop();
		System.out.println(topEle2);
		System.out.println();
		st.print();
		
	}
}