class ListNode {
	int data;
	ListNode next;

	ListNode(int data) {
		this.data = data;
		this.next = null;
	}

	void print() {
		ListNode temp = this;
		if(temp == null) {
			return;
		}
		else {
			do {
				System.out.print("->" + temp.data);
				temp = temp.next;
			}while(temp != this && temp != null);
		}
		System.out.println();
	}

	void insert(int data) {
		ListNode newNode = new ListNode(data);
		if(this.next == null) {
			this.next = newNode;
			newNode.next = this;
		}
		else {
			ListNode temp = this;
			while(temp != this) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.next = this;
		}
	}
}
class CircularLL {
	public static void main(String[] args) {
		ListNode n = new ListNode(3);
		n.print();

		n.insert(4);
		n.print();
	}
}