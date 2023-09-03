import java.util.HashSet;

public class FindTheIndexFirstOcurrence {

    public static void main(String[] args) {
        System.out.println("Hello Find the Index of the First Ocurrence");
        FindTheIndexFirstOcurrence findTheIndexFirstOcurrence = new FindTheIndexFirstOcurrence();
        findTheIndexFirstOcurrence.strStr("sadbutsad", "sad");
        findTheIndexFirstOcurrence.strStr("leetcode", "leeto");
        findTheIndexFirstOcurrence.strStr("hello", "ll");
        findTheIndexFirstOcurrence.strStr("aaa", "aaaa");
    }

    public int strStr(String haystack, String needle) {

        int start = 0;
        int end = needle.length();
        int tot = haystack.length();
        int indexOcurr = -1;

        while (start < tot && end <= tot) {
            if (haystack.substring(start, end).equals(needle)) {
                indexOcurr = start;
                start++;
                end++;
                return indexOcurr;
            } else {
                start++;
                end++;
            }
        }
        return indexOcurr;
    }
}
