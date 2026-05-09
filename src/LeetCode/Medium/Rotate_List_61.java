package LeetCode.Medium;

import LeetCode.Medium.Node_class_Problem.ListNode;

public class Rotate_List_61 {
//    public ListNode rotateRight(ListNode head, int k){
//
//        //Find the Length
//        ListNode temp = head;
//        int length=1;
//
//        while (temp.next != null){
//            temp = temp.next;
//            length++;
//        }





//        if(head == null || head.next == null || k == 0) return head;
//
//        ListNode temp = head;
//        int length = 1;
//
//        while(temp.next != null){
//            temp = temp.next;
//            length++;
//        }
//
//
//        k = k % length;
//
//        if(k == 0) return head;
//
//
//        temp.next = head;
//
//
//        int steps = length - k;
//        ListNode newTail = head;
//
//        for(int i = 1; i < steps; i++){
//            newTail = newTail.next;
//        }
//
//
//        ListNode newHead = newTail.next;
//
//
//        newTail.next = null;
//
//        return newHead;

//    }
}

/*

  public ListNode rotateRight(ListNode head, int k) {

        // edge case
        if(head == null || head.next == null || k == 0) return head;

        // Step 1: find length + last node
        ListNode tail = head;
        int length = 1;

        while(tail.next != null){
            tail = tail.next;
            length++;
        }

        // Step 2: reduce k
        k = k % length;
        if(k == 0) return head;

        // Step 3: make circular
        tail.next = head;

        // Step 4: move to new tail
        int steps = length - k;
        ListNode newTail = head;

        for(int i = 1; i < steps; i++){
            newTail = newTail.next;
        }

        // Step 5: break
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
 */