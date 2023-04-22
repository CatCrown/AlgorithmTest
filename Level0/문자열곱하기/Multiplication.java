package Level0.문자열곱하기;
// 문자열 my_string과 정수 k가 주어질 때,
// my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.

public class Multiplication {
    public static void main(String[] args) {
        Solution s = new Solution();
//        String my_String = "string";
        String my_String = "love";
//        int  k = 3;
        int  k = 5;
        System.out.println(s.solution(my_String,k));
    }
}
class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        for (int i = 0; i < k; i++){
            answer += my_string;
        }
        return answer;
    }
}