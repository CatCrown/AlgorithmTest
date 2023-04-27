package Level0.카운트다운;

import java.util.ArrayList;

// 정수 start와 end가 주어질 때,
// start에서 end까지 1씩 감소하는 수들을 차례로 담은 리스트를
// return하도록 solution 함수를 완성해주세요.
public class CountDown {
    public static void main(String[] args) {
        Solution s = new Solution();
        int start = 10;
        int end = 3;
        System.out.println(s.solution(start,end));
    }
}
class Solution {
    public ArrayList<Integer> solution(int start, int end) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = start; i >= end; i--){
            answer.add(i);
        }
        return answer;
    }
}