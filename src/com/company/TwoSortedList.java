package com.company;

class ListNode {
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

public class TwoSortedList {
    public static ListNode mergeTwoLists(ListNode headA, ListNode headB) {
        /* a dummy first node to hang the result on */
        ListNode dummyNode = new ListNode(0);

        /* tail points to the last result node */
        ListNode tail = dummyNode;
        while (true) {

            /* if either list runs out,use the other list */
            if (headA == null) {
                tail.next = headB;
                break;
            }
            if (headB == null) {
                tail.next = headA;
                break;
            }

        /* Compare the data of the two lists whichever lists' data is
        smaller, append it into tail and advance the head to the next Node
        */
            if (headA.val <= headB.val) {
                tail.next = headA;
                headA = headA.next;
            } else {
                tail.next = headB;
                headB = headB.next;
            }

            /* Advance the tail */
            tail = tail.next;
        }
        return dummyNode.next;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode head = mergeTwoLists(l1, l2);
        printList(head);
    }
}
/* ListNode res = new ListNode();
        ListNode temp = new ListNode();
        ListNode temp2 = new ListNode();
        ListNode next = new ListNode();

        if (l1 == null && l2 == null) {
            return l1;
        } else if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else {
            temp=l1;
            temp2=l2;
            while(temp!=null&&temp2!=null){ // 1->2->4  ITR1: next=   3->4 , temp2=  1->2->4 , temp=  1->1->2->4 , temp2=   3->4.
                if(temp.val<=temp2.val){    // 1->3->4  ITR2:
                    next=temp2.next;
                    temp2.next=temp.next;
                    temp.next=temp2;
                    temp2=next;
                }
                else{
                    next=temp.next;
                    temp.next=temp2.next;
                    temp2.next=temp;
                    temp=next;
                }

            }
        }*/