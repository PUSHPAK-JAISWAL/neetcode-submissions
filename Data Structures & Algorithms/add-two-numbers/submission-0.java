class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        while (l1 != null) {
            sb1.append(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            sb2.append(l2.val);
            l2 = l2.next;
        }

        sb1.reverse();
        sb2.reverse();

        java.math.BigInteger num1 = new java.math.BigInteger(sb1.toString());
        java.math.BigInteger num2 = new java.math.BigInteger(sb2.toString());
        java.math.BigInteger total = num1.add(num2);

        StringBuilder sb3 = new StringBuilder(total.toString());
        sb3.reverse();

        ListNode head = new ListNode(sb3.charAt(0) - '0');
        ListNode curr = head;

        for (int i = 1; i < sb3.length(); i++) {
            curr.next = new ListNode(sb3.charAt(i) - '0');
            curr = curr.next;
        }

        return head;
    }
}