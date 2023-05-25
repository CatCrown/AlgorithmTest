package Level0.중앙값구하기;
import java.util.*;
public class Center {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] array = {1, 2, 7, 10, 11};
//        int[] array = {9, -1, 0};
        System.out.println(s.solution(array));
    }
}

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        answer = array[(int)array.length / 2];

        return answer;
    }
}