public class LongestPalindrome {

    public static void main(String[] args) {
        System.out.println("Hello Longest Palindrome SubsString!");

        String s = "NATAN";

        LongestPalindrome longestPalindrome = new LongestPalindrome();
        longestPalindrome.longestPalindrome(s);

    }

    public String longestPalindrome(String s) {

        // Declaring a StringBuilder and converting string to StringBuilder
        StringBuilder reverseString = new StringBuilder(s);

        // Converting StringBuilder to String
        String valRev = String.valueOf(reverseString.reverse());
        String longestString;
        String substr;

        System.out.println("Input es: " + s);
        System.out.println("Palabra el reves es:" + valRev);

        for (int i=5; s.length()>i; i--){
            if (s.equals(valRev)){
                longestString = s;
            } else {
                substr = valRev.substring(i,(i-1));
            }
        }


        //buscar la primera y ultima lentra y evalua palindromo, sino te achicas.

        return s;
    }

}
