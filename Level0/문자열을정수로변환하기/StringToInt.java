package Level0.문자열을정수로변환하기;

public class StringToInt {
    public static void main(String[] args) {
        Solution s = new Solution();
        String n_str = "10";
        System.out.println(s.solution(n_str));
    }
}
class Solution {
    public int solution(String n_str) {
        int answer = 0;
        answer = Integer.parseInt(n_str);
        return answer;
    }
}