package LinkedList;

public class ReorderList {

	public static void main(String[] args) {
		ListNode n5 = new ListNode(5);
		ListNode n4 = new ListNode(4,n5);
		ListNode n3 = new ListNode(3,n4);
		ListNode n2 = new ListNode(2,n3);
		ListNode n1 = new ListNode(1,n2);
		
		ListNode head = reorderList(n1);
		while(head!=null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
	public static ListNode reorderList(ListNode head) {
        if(head==null || head.next == null){
            return head;
        }
        ListNode temp1= head;
        ListNode temp2= head.next;
        ListNode l1 = temp1;
        ListNode l2 = temp2;
        int alternate = 1;
        while(true){
            if(alternate%2==1){
                if(temp2!=null ){
                    temp1.next = temp2.next;
                    temp1= temp1.next;
                }else{
                    break;
                }
            }
            else{
                if(temp1!=null ){
                    temp2.next = temp1.next;
                    temp2= temp2.next;
                }else{
                    break;
                }
            }
            alternate++;
        }
        l2= reverse(l2);
        mergeList(l1,l2);
        return head;
    }
	private static ListNode reverse(ListNode head) {
		if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode current = head;
        while(current!=null){
            ListNode temp = current.next;

            current.next = prev;

            prev= current;
            current = temp;
        }
        return prev;
	}
	private static void mergeList(ListNode l1, ListNode l2) {
		ListNode head = l1;
		int alternate = 1;
		ListNode temp = null;
		while(true) {
			if(alternate%2==1 && l2!=null) {
				temp = l1.next;
				head.next = l2;
				head= head.next;
				l1 =temp;
			}else if(alternate%2==0 && l1!=null) {
				temp = l2.next;
				head.next = l1;
				head= head.next;
				l2= temp;
			}
			else break;
			alternate++;
		}
	}

}
