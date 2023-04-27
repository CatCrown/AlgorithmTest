package Level0.문자열의뒤의n글자;

// 문자열 my_string과 정수 n이 매개변수로 주어질 때,
// my_string의 뒤의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
public class StringNChar {
    public static void main(String[] args) {
        Solution s = new Solution();
        String my_string = "ProgrammerS123";
        int n = 11;
        System.out.println(s.solution(my_string,n));
    }
}
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int num = my_string.length() - n;
        StringBuffer sb = new StringBuffer(my_string);
        String str = sb.substring(num);
        answer = str;
        return answer;
    }
}