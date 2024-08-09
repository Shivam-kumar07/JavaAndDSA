package LinkedList;

public class ReorderListOg {

	public static void main(String[] args) {
		ListNode n5 = new ListNode(5);
		ListNode n4 = new ListNode(4, n5);
		ListNode n3 = new ListNode(3, n4);
		ListNode n2 = new ListNode(2, n3);
		ListNode n1 = new ListNode(1, n2);

		ListNode head = reorderList(n1);
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}

	public static ListNode reorderList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode l1 = head;
        ListNode slow= head; 
        ListNode fast = head;
        ListNode prev= null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode l2= reverse(slow);
        mergeList(l1,l2);
		return l1;
	}

	private static ListNode reverse(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode prev = null;
		ListNode current = head;
		while (current != null) {
			ListNode temp = current.next;

			current.next = prev;

			prev = current;
			current = temp;
		}
		return prev;
	}

	private static void mergeList(ListNode first, ListNode second) {
		while(second.next != null){
            ListNode temp = first.next;
            first.next = second;
            first =  second;
            second = temp;
        }
	}

}
