class ListNode {
	int data;
	ListNode next;

	ListNode (int data) {
		this.data = data;
		this.next = null;
	}

	void print() {
		ListNode temp = this;
		while(temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
	}

	ListNode insertHead(int data) {
		ListNode head = this;
		ListNode newNode = new ListNode(data);

		newNode.next = head;
		head = newNode;

		return head;
	}

	ListNode insertTail(int data) {
		ListNode head = this;
		ListNode newNode = new ListNode(data);
		ListNode temp = head;

		while(temp.next != null) {
			temp = temp.next;
		}

		temp.next = newNode;
		return head;
	}

	ListNode insert(int data, int pos) {
		ListNode head = this;
		ListNode temp = head;
		ListNode newNode = new ListNode(data);

		if(pos == 1) {
			head = insertHead(data);
		}
		else {
			int curr = 0;
			while(curr != pos-2) {
				temp = temp.next;
				curr += 1;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
		return head;
	}

	ListNode deleteNode(int pos) {
		ListNode head = this;
		if(pos == 1) {
			head = head.next;
		}
		else {
			int curr = 0;
			ListNode temp = head;
			while(curr != pos - 2) {
				temp = temp.next;
				curr += 1;
			}
			temp.next = temp.next.next;

		}
		return head;
	}
}
class LinkedList {
	public static void main(String args[]) {
		ListNode n = new ListNode(2);
		n.print();

		System.out.println();

		n = n.insertHead(1);
		n.print();
		System.out.println();

		n = n.insertTail(3);
		n.print();
		System.out.println();

		n = n.insertTail(5);
		n.print();
		System.out.println();

		n = n.insert(4, 4);
		n.print();
		System.out.println();

		n = n.insert(0, 1);
		n.print();
		System.out.println();

		n = n.deleteNode(1);
		n.print();
		System.out.println();

		n = n.deleteNode(4);
		n.print();
		System.out.println();
	}
}