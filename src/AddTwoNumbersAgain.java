//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order,
// and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.

public class AddTwoNumbersAgain {

    public static void main(String[] args) {

        //ListNode l1 es el head y solo tiene conocimiento del sgte ListNode(Next) nada mas. Y asi se arma la ListNode.
        ListNode nodeB = new ListNode(3);
        ListNode nodeA = new ListNode(4, nodeB);
        ListNode l1 = new ListNode(2, nodeA);


        ListNode nodeD = new ListNode(4);
        ListNode nodeC = new ListNode(6, nodeD);
        ListNode l2 = new ListNode(5, nodeC);

        AddTwoNumbersAgain addTwoNumbers = new AddTwoNumbersAgain();
        addTwoNumbers.addTwoNumbers(l1,l2);

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        int remainder = 0;
        ListNode listFinal = new ListNode(0);

        while (l1 != null || l2 != null){

            int sum = 0;

            if (carry > 0){
                sum = l1.val + l2.val + carry;
                remainder = sum/10;
            } else {

                sum = l1.val + l2.val;
                remainder = sum/10;
            }

            if (remainder > 0 ){
                sum = remainder/10;
                carry = remainder%10;
            } else {
                //aqui va algo?
            }
            listFinal.val = sum;
            System.out.println(" *** El Nodo tiene el valor de *** " + listFinal.val);

            l1 = l1.next;
            l2 = l2.next;
        }
        return listFinal;
    }
}
