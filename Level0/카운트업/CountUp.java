package Level0.카운트업;

// 정수 start와 end가 주어질 때,
// start부터 end까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

import java.util.ArrayList;

public class CountUp {
    public static void main(String[] args) {
        Solution s = new Solution();
        int start = 3;
        int end = 10;
        System.out.println(s.solution(start,end));
    }
}
class Solution {
    public ArrayList<Integer> solution(int start, int end) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = start; i <= end; i++){
            answer.add(i);
        }
        return answer;
    }
}