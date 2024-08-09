package LinkedList;

public class ListNode {
	int val;
	ListNode next;
	ListNode lastNode;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}
	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
	public void add(ListNode head, int val) {
		if(head == null) {
			head = new ListNode(val);
			head.next = null;
			lastNode = null;
		}else {
			ListNode temp = new ListNode(val);
			temp.next = null;
			lastNode.next = temp;
		}
	}
}
