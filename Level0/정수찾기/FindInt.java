package Level0.정수찾기;

import java.util.stream.IntStream;

public class FindInt {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num_list = {1, 2, 3, 4, 5};
        int n = 3;
        System.out.println(s.solution(num_list,n));
    }
}
class Solution {
    public int solution(int[] num_list, int n) {
        return IntStream.of(num_list).anyMatch(num -> num == n) ? 1 : 0;

//        int answer = 0;
//        for(int num : num_list){
//            if(num == n){
//                answer = 1;
//                break;
//            }
//        }
//        return answer;
    }
}