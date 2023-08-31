public class RomanToInteger {

    public static void main(String[] args) {

        System.out.println("Hello Roman to Integer!");

        RomanToInteger romanToInteger = new RomanToInteger();

        System.out.println(romanToInteger.romanToInt("IV"));
    }

    public int romanToInt(String romanString) {
        int finalValue = 0;
        int num = 0;

        for (int i = romanString.length()-1; i >= 0; i--) {
            switch(romanString.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < finalValue) finalValue -= num;
            else finalValue += num;
        }
        return finalValue;
    }
}
