class ListNode {
	ListNode prev;
	int data;
	ListNode next;

	ListNode(int data) {
		this.prev = null;
		this.data = data;
		this.next = null;
	}

	ListNode insert(int pos, int data) {
		ListNode head = this;
		ListNode newNode = new ListNode(data);

		if(pos == 1) {
			newNode.next = head;
			head = newNode;
		}
		else {
			int curr = 1;
			ListNode temp = this;
			while(curr < pos - 1) {
				temp = temp.next;
				curr += 1;
			}

			if(temp.next == null) {
				temp.next = newNode;
				newNode.prev = temp;
				return head;
			}

			newNode.next = temp.next;
			temp.next.prev = newNode;
			temp.next = newNode;
			newNode.prev = temp;
		}

		return head;
	}

	ListNode delete(int pos) {
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
			temp.next.prev = temp;
		}
		return head;
	}

	void print() {
		ListNode temp = this;
		while(temp != null) {
			System.out.print("<-"+temp.data + "->");
			temp = temp.next;
		}
		System.out.println();
	}
}
class DoublyLinkedList {
	public static void main(String args[]) {
		ListNode n1 = new ListNode(2);
		n1.print();

		n1 = n1.insert(1, 1);
		n1.print();

		n1 = n1.insert(3, 3);
		n1.print();

		n1 = n1.insert(4, 4);
		n1.print();

		n1 = n1.delete(3);
		n1.print();
	}
}