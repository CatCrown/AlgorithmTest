package Level0.문자열섞기;
// 길이가 같은 두 문자열 str1과 str2가 주어집니다.
//
//두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서
// 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요

public class StringMix {
    public static void main(String[] args) {
        Solution s = new Solution();
        String str1 = "aaaaa";
        String str2 = "bbbbb";
        System.out.println(s.solution(str1,str2));
    }
}
class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        for (int i = 0; i < str1.length(); i++){
            answer = answer + str1.charAt(i) + str2.charAt(i);
        }
        return answer;
    }
}