package inflearn;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your name?");
        String name = scanner.next();

        System.out.println("what is your age?");
        int age = scanner.nextInt();

        System.out.println("your name is" +name+ " and " + "your age is" + age);
    }
}
