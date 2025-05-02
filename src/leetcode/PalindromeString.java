package leetcode;

import java.util.stream.IntStream;

public class PalindromeString {

    private static boolean isPalindromeTowPointer (String str) {

        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]]","");

        int left = 0;
        int right = str.length()-1;

        while(left<right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean isPalindromeRecursion (String str, int start, int end) {
        if(start >= end) {
            return true;
        }
        if(str.charAt(start) != str.charAt(end)) {
            return  false;
        }
        return isPalindromeRecursion(str, start+1, end-1);
    }

    private static boolean isPalindromeLamda (String str) {
        String str2 = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        return IntStream.range(0, str.length() / 2)
                .allMatch(i -> str2.charAt(i) == str2.charAt(str2.length() - i - 1));
    }

    private static boolean isPalindromeSB(String str) {
        String clean = str.toLowerCase();
        String reverse = new StringBuilder(clean).reverse().toString();
        return clean.equals(reverse);
    }

    public static void main(String[] args) {
        String str = "pullup if i pull up";

        isPalindromeTowPointer(str);
        isPalindromeRecursion(str, 0, str.length()-1);
        isPalindromeLamda(str);
        isPalindromeSB(str);
    }
}
