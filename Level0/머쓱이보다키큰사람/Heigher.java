package Level0.머쓱이보다키큰사람;
import java.util.*;
public class Heigher {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] array = {149, 180, 192, 170};
        int height = 167;
        System.out.println(s.solution(array,height));

    }
}

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        answer = (int) Arrays.stream(array)
                .filter(h -> h > height)
                .count();
        return answer;
    }
}