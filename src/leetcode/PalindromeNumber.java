package leetcode;

import java.math.BigInteger;

public class PalindromeNumber {

    public static boolean isPalindrome(int num) {
    // 반복문을 통해 10으로 나눈 나머지 값을 reversNumber 만들어서 비교
        if(num < 0) {return false;}

        int originNumber = num;
        int rev = 0;

        while( num > 0) {
            int remainder = num % 10 ;
            rev = rev * 10 + remainder;
            num /= 10;
        }

        return originNumber == rev;
    }

    private static boolean isPalindromeRecursive(int num, int rev) {
        // 위와 같은 원리, 재귀(Recursion)을 이용한 방법
        if (num < 10) {
            return rev * 10 + num == num;
        } else {
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            return isPalindromeRecursive(num / 10, rev);
        }
    }

    private static boolean isPalindromeBingInteger (BigInteger num) {
        BigInteger reverseNumber = new BigInteger(new StringBuilder(num.toString()).reverse().toString());
        return num.compareTo(reverseNumber) == 0;
    }


    public static void main(String[] args) {
        int number = 12321;

        if(isPalindrome(number)) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }

}
