package Level0.저주의숫자;

public class Number {
    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 15;
        System.out.println(s.solution(n));
    }
}
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            answer++;
            while (answer % 3 == 0 || Integer.toString(answer).indexOf('3') >= 0){
                answer++;
            }

            System.out.println("i = " + i + ", answer = " + answer);
        }
        return answer;
    }
}