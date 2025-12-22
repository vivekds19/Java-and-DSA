
class ListNode {

    int val;
    ListNode next;

    // Constructor
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MergeTwoList {

    // Method to merge two sorted linked lists
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Dummy node
        ListNode merge = new ListNode(0);
        ListNode temp = merge;

        ListNode head1 = list1;
        ListNode head2 = list2;

        // Merge while both lists have nodes
        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        // Attach remaining nodes
        if (head1 != null) {
            temp.next = head1;
        } else {
            temp.next = head2;
        }

        // Return merged list head
        return merge.next;
    }

    // Method to display linked list
    public static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // First sorted list: 1 -> 3 -> 5
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        // Second sorted list: 2 -> 4 -> 6
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        System.out.println("List 1:");
        display(list1);

        System.out.println("List 2:");
        display(list2);

        // Merge lists
        ListNode mergedList = mergeTwoLists(list1, list2);

        System.out.println("Merged List:");
        display(mergedList);
    }
}
