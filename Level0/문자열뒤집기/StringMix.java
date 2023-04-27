package Level0.문자열뒤집기;

// 문자열 my_string과 정수 s, e가 매개변수로 주어질 때,
// my_string에서 인덱스 s부터 인덱스 e까지를 뒤집은 문자열을 return 하는 solution 함수를 작성해 주세요.
public class StringMix {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string =  "Progra21Sremm3";
        int s = 6;
        int e = 12;
        System.out.println(sol.solution(my_string,s,e));
    }
}
class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        StringBuffer sb = new StringBuffer(my_string);
        StringBuffer part = new StringBuffer(sb.substring(s,e+1));
        String str = String.valueOf(part.reverse());
        sb.replace(s,e+1,str);
        answer += sb;

        return answer;
    }
}