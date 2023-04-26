public class MergeTwoSortedList {

    public static void main(String[] args) {
        System.out.println("Merge Two Sorted List!");

        ListNode nodeB = new ListNode(4);
        ListNode nodeA = new ListNode(2, nodeB);
        ListNode l1 = new ListNode(1, nodeA);


        ListNode nodeD = new ListNode(4);
        ListNode nodeC = new ListNode(3, nodeD);
        ListNode l2 = new ListNode(1, nodeC);

        MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
        mergeTwoSortedList.mergeTwoLists(l1,l2);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode prehead = new ListNode(10);
        ListNode cur = prehead;

        while (list1 != null && list2 != null){
            if (list1.val <= list2.val){
                cur.next = list1;
                list1 = list1.next;
                System.out.println("Resultado A:" + cur.next.val);
            } else {
                cur.next = list2;
                list2 = list2.next;
                System.out.println("Resultado B:" + cur.next.val);
            }
        }

        if (list1 == null){
            cur.next = list2;
        } else {
            cur.next = list1;
        }
        System.out.println("Resultado final:" + cur.next.val);
        return cur.next;
    }
}
