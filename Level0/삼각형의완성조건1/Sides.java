package Level0.삼각형의완성조건1;

import java.util.Arrays;

public class Sides {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] sides = {1, 2, 3};
        System.out.println(s.solution(sides));
    }
}
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Arrays.stream(sides).max().getAsInt();
        int sum = Arrays.stream(sides).sum();
        answer = sum-max > max ? 1:2;
        return answer;
    }
}