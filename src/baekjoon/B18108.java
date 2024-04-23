package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class B18108 {
    public static void main(String[] args) throws IOException {
        //방법 1
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(year);

        //방법 2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int adYear = Integer.parseInt(s);
        int beYear = adYear-543;
        System.out.println(adYear);
    }
}
