package programmers.lv0;

public class StringToInteger {
    public static void main(String[] args) {

        /**
         * 숫자로만 이루어진 문자열 n_str이 주어질 때, n_str을 정수로 변환하여 return하도록 solution 함수를 완성해주세요.
         */
        class Solution {
            //방법1
            public int solution1(String n_str) {
                return Integer.parseInt(n_str);
            }

            // 방법2
            public int solution2(String n_str) {
                int answer = 0;
                for(int i=0; i<n_str.length(); i++){
                    answer = answer * 10;
                    answer += n_str.charAt(i)-48;
                }
                return answer;
            }
        }

        Solution test = new Solution();
        test.solution1("12345");
        test.solution2("12345");
    }
}
