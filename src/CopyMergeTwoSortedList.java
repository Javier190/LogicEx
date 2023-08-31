public class CopyMergeTwoSortedList {


    //TIPICOS DE PREGUNTAS

    public static void main(String[] args) {
        System.out.println("Submitted on LeetCode Merge Two Sorted List!");

        ListNode nodeB = new ListNode(4);
        ListNode nodeA = new ListNode(2, nodeB);
        ListNode l1 = new ListNode(1, nodeA);


        ListNode nodeD = new ListNode(4);
        ListNode nodeC = new ListNode(3, nodeD);
        ListNode l2 = new ListNode(1, nodeC);

        CopyMergeTwoSortedList copyMergeTwoSortedList = new CopyMergeTwoSortedList();
        copyMergeTwoSortedList.mergeTwoLists(l1,l2);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode head = null;
        ListNode tail = null;

        if (list1.val <= list2.val) {
            head = tail = list1;
            list1 = list1.next;
        } else {
            head = tail = list2;
            list2 = list2.next;
        }

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                tail = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                tail = list2;
                list2 = list2.next;
            }
        }
        if (list1 == null) tail.next = list2;
        else tail.next = list1;
        System.out.println("Return head"+ head.val);
        return head;

    }
}
