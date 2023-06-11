class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null){
          return null;
        }
        ListNode oddHead = new ListNode(0);
        ListNode oddIt = oddHead;
        ListNode evenHead = new ListNode(0);
        ListNode evenIt = evenHead;    
        while (head != null) {
            oddIt.next = head;
            evenIt.next = head.next;
            oddIt = oddIt.next;
            evenIt = evenIt.next;
            if(head.next!=null) {
                head = head.next.next;
            }
            else {
                head = null;
            }
        }
        oddIt.next = evenHead.next;
        return oddHead.next;
    }
}
