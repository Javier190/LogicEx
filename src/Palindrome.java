
public class Palindrome {

    //StringBuilder te puede hacer poner alreves tu String
    public static void main(String[] args) {
        System.out.println("Hello Palindrome!");

        Palindrome palindrome = new Palindrome();
        palindrome.isPalindrome(11251);
    }

    public boolean isPalindrome(int x) {

        String valStr = String.valueOf(x);

        // Declaring a StringBuilder and converting string to StringBuilder
        StringBuilder reverseString = new StringBuilder(valStr);

        // Reversing the StringBuilder
        reverseString.reverse();

        // Converting StringBuilder to String
        String valRev = reverseString.toString();

        if (valStr.equals(valRev)) {
            System.out.println("Son Palindromos");
            System.out.println("String normal: " + valStr);
            System.out.println("String Reversa: " + valRev);
            return true;

        } else {
            System.out.println("No son palindromos");
            System.out.println("String normal: " + valStr);
            System.out.println("String Reversa: " + valRev);
            return false;
        }

    }

}

