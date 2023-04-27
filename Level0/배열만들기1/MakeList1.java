package Level0.배열만들기1;

import java.util.ArrayList;

// 정수 n과 k가 주어졌을 때,
// 1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을
// return 하는 solution 함수를 완성해 주세요.
public class MakeList1 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 10;
        int k = 3;
        System.out.println(s.solution(n,k));
    }
}
class Solution {
    public ArrayList<Integer> solution(int n, int k) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = k; i <= n; i++){
            if (i % k == 0){
                answer.add(i);
            }
        }
        return answer;
    }
}