package Level0.홀짝에따라다른값반환하기;

// 양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고
// n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.
public class DifferentResult {
    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 10;
        System.out.println(s.solution(n));
    }
}
class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n % 2 != 0){
            for (int i = 1; i <= n; ){
                answer += i;
                i += 2;
            }
        }else {
            for (int j = 2; j <= n; ){
                int tmp = (int) Math.pow(j,2);
                answer += tmp;
                j+=2;
            }
        }
        return answer;
    }
}