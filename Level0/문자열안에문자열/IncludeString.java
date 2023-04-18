package Level0.문자열안에문자열;

//문자열 str1, str2가 매개변수로 주어집니다.
// str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.


public class IncludeString {
    public static void main(String[] args) {


        Solution s = new Solution();
//        String str1 = "ab6CDE443fgh22iJKlmn1o";
//        String str2 = "6CD";
        String str1 = "ppprrrogrammers";
        String str2 = "pppp";
//        String str1 = "AbcAbcA";
//        String str2 = "AAA";

        System.out.println(s.solution(str1,str2));

    }
}
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        int idx = str1.indexOf(str2);
        if (idx >= 0){
            answer = 1;
        }else {
            answer = 2;
        }
        return answer;
    }
}
