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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        ListNode dummy = new ListNode(0); // creating an dummy list
        ListNode curr = dummy;


        while (l1 != null || l2 != null){

            int sum = 0;

            int test = 10;
            System.out.println("sdasd" + test%5);

            if (carry >= 10){
                sum = l1.val + l2.val + carry;

                System.out.println("Valor suma con Reserva: " + sum);
            } else {
                sum = l1.val + l2.val;
                System.out.println("Valor de la suma es:" + sum);

                if (sum >= 10){
                    carry = sum - 10;
                    System.out.println("ELSE de Suma es: " + sum);
                }
            }



                l1 = l1.next;
                l2 = l2.next;

            System.out.println("Fin un ciclo");
        }
        return null;
    }
}
