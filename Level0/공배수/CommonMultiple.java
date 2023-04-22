package Level0.공배수;

public class CommonMultiple {
    public static void main(String[] args) {
        Solution s = new Solution();
        int number = 60;
        int n = 2;
        int m = 3;
        System.out.println(s.solution(number,n,m));
    }
}
class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        answer = number % n == 0 && number % m == 0 ? 1 : 0;
        return answer;
    }
}