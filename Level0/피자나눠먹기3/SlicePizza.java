package Level0.피자나눠먹기3;

public class SlicePizza {
    public static void main(String[] args) {
        Solution s = new Solution();
        int slice = 7;
        int n = 10;
        System.out.println(s.solution(slice,n));
    }

}
class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        answer = (int) Math.ceil((float)n/slice);
        return answer;
    }
}