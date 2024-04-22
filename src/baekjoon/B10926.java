package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class B10926 {
    public static void main(String[] args) throws IOException {
        //방법 1
        Scanner sc = new Scanner(System.in);
        String id1 = sc.next();
        System.out.println(id1 + "??!");

        //방법 2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String id2 = br.readLine();
        System.out.println(id2+"??!");
    }
}
