class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       
        ListNode last = head;
        int count = 0;
        while (last != null) {
            count++;
            last = last.next;
        }

        if (count == n) {
            return head.next;
        }

        int target = count - n;
        ListNode curr = head;
        for (int count2 = 1; count2 < target; count2++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return head;
    }
}