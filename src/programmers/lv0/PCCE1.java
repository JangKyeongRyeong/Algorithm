package programmers.lv0;

//[PCCE 기출문제] 1번 / 출력
public class PCCE1 {
    public static void main(String[] args) {
        String msg = "Spring is beginning";
        int val1 = msg.split(" ").length;
        String val2 = String.valueOf(val1);

        System.out.println(msg);
        System.out.println(val1 + 10);
        System.out.println(val2 + "10");


        int val = 100;
        String str1 = String.valueOf(val); // int를 String으로 변환한다.
        String str2 = ""+ 100;  //  덧셈 연산자 사용 시 효율성 낮아짐.

        System.out.println(str1);
        System.out.println(str2);
    }
}
