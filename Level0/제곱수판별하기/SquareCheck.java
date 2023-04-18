package Level0.제곱수판별하기;

public class SquareCheck {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int n = 144;
        int n = 976;
        System.out.println(s.solution(n));
    }
}
class Solution {
    public int solution(int n) {
        int answer = 0;

        int sqrt = (int) Math.sqrt(n); // 제곱근
        int pow = (int) Math.pow(sqrt,2); // 거듭제곱
        if (pow == n){
            answer = 1;
        }else {
            answer = 2;
        }
        return answer;
    }
}