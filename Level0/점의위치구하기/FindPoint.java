package Level0.점의위치구하기;

public class FindPoint {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] dot = {2,4};
        System.out.println(s.solution(dot));
    }
}
class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        answer = dot[0] > 0 ? (dot[1] > 0 ? 1 : 4) : (dot[1] > 0 ? 2 : 3);

        return answer;
    }
}