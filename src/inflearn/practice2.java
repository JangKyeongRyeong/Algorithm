package inflearn;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter one integer:");
        int number = scanner.nextInt();

        if(number%2 > 0 ) {
            System.out.println(number+" : it's odd number.");
        }else {
            System.out.println(number+" : it's even number.");
        }
    }
}
