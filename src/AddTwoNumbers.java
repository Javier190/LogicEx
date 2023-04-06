import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order,
// and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.

public class AddTwoNumbers {

    public static void main(String[] args) {

        //ListNode l1 es el head y solo tiene conocimiento del sgte ListNode(Next) nada mas. Y asi se arma la ListNode.
        ListNode nodeB = new ListNode(3);
        ListNode nodeA = new ListNode(4, nodeB);
        ListNode l1 = new ListNode(2, nodeA);


        ListNode nodeD = new ListNode(4);
        ListNode nodeC = new ListNode(6, nodeD);
        ListNode l2 = new ListNode(5, nodeC);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        addTwoNumbers.addTwoNumbers(l1,l2);

    }

    //Repasar este codigo que funciona pero no es el mio completamente.
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        int carry = 0;
        while(l1 != null || l2 != null || carry == 1){
            int sum = 0;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum/ 10;
            ListNode node = new ListNode(sum % 10);
            temp.next = node;
            temp =  temp.next;
        }
        return dummy.next;
    }
}
