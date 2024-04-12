package baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class HelloWorld {
    public static void main(String[] args) throws IOException {

        // 방법1
        System.out.println("Hello World!");

        // 방법2
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("Hello World!");//버퍼에 있는 값 전부 출력
        bw.flush();   //남아있는 데이터를 모두 출력시킴
        bw.close();   //스트림을 닫음

        // 방법3
        StringBuilder sb = new StringBuilder();
        sb.append("Hello Workld!");

        System.out.println(sb);

        /*
            BufferedReader: Scanner와 유사.
            Bufferedwriter: System.out.println();와 유사
            참고 블로그 -> https://m.blog.naver.com/ka28/221850826909
        */
    }
}
