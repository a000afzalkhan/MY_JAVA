package LeetCode.Medium.Node_class_Problem;


public class Swap_Nodes_in_Pairs_24 {
    static void main(String[] args) {

    }
    public ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode(0);                          //👉 एक extra fake node (dummy) बना रहे हैं

        dummy.next = head;                                            //👉 dummy को original list से जोड़ दिया

                                                            // 0(dummy) → 1 → 2 → 3 → 4  => 👉 अब list दिखती है:

        ListNode current = dummy;                               //👉 current pointer शुरू में dummy पर है

        while (current.next != null && current.next.next != null) {   //👉 position  1 and position 1 . next ! = null  [ means => 1 and 2 are not null ]

                                                                //current = 0
                                                                // 0(dummy) → 1 → 2 → 3 → 4

            ListNode first = current.next;        // 👉 0->1   mean => 1
            ListNode second = current.next.next;    // 👉 0-> 1.next mean => 2

            first.next = second.next;
            second.next = first;
            current.next = second;

            current = first;

        }
        return dummy.next;

    }
}

/*

 public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy;

        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;

            first.next = second.next;
            second.next = first;
            current.next = second;

            current = first;
        }

        return dummy.next;
    }

 */