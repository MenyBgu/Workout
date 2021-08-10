package com.company;

public class AddTwoNumbersRevers {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode curr = dummyHead;

        int carry = 0;

        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }

        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return dummyHead.next;
    }

    public static void main(String args[]) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(9);
        ListNode four = new ListNode(9); // 421
        one.next = two;
        two.next = four;
        four.next=new ListNode(9);
        four.next.next=new ListNode(9);
        four.next.next.next=new ListNode(9);
        four.next.next.next.next=new ListNode(9);
        four.next.next.next.next.next=new ListNode(9);
        four.next.next.next.next.next.next=new ListNode(9);
        four.next.next.next.next.next.next.next=new ListNode(9);

        ListNode one1 = new ListNode(9); // 432 --> output should be 421+432=853
		/*ListNode two2 = new ListNode(9);
		ListNode four4 = new ListNode(9);
		one1.next = two2;
		two2.next = four4;
		four4.next=new ListNode(9);*/

        ListNode res = new ListNode();
        res = addTwoNumbers(one1, one);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}
