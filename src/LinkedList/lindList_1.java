package LinkedList;

public class lindList_1 {
    static void main(String[] args) {

        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node four = new Node(40);

        Node temp = head;

        head.next = second;
        second.next = third;
        third.next = four;

        while (temp != null) {    // temp = 0  => [ 10 != 0 ]  true

            System.out.print(temp.data + " -> ");

            temp = temp.next;

        }
        System.out.println("null");



    }
}
class Node{
    int data;
    Node next;

    Node (int data){
        this.data = data;
        this.next = null;
    }
}
