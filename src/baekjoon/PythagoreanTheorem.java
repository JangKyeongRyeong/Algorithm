package baekjoon;

import java.util.Scanner;

public class PythagoreanTheorem {
    /**
     * 직각삼각형의 한 변의 길이를 나타내는 정수 a와 빗변의 길이를 나타내는 정수 c가 주어질 때,
     * 다른 한 변의 길이의 제곱, b_square 을 출력하도록 한 줄을 수정해 코드를 완성해 주세요.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        //풀이 1
        int b_square = (int) (Math.pow(c, 2) - Math.pow(a, 2));

        //풀이 2
        //int b_square = (c - a) * (c + a);

        System.out.println(b_square);
    }
}
