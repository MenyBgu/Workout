package com.company;

public class SortedListMerge {
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

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyNode=new ListNode();
        ListNode tail=dummyNode;
        while(true){
            if(l1==null){
                tail.next=l2;
                break;
            }
            if(l2==null){
                tail.next=l1;
                break;
            }
            if(l1.val<=l2.val){
                tail.next=l1;
                l1=l1.next;
            }
            else{
                tail.next=l2;
                l2=l2.next;
            }
            tail=tail.next;
        }
        return dummyNode.next;
    }

    private static void printList(ListNode head) {
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }

    }
}
