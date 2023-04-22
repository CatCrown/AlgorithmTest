package Level0.마지막두원소;

// 정수 리스트 num_list가 주어질 때,
// 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 마지막 원소가
// 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.

import java.util.ArrayList;

public class EndTwoElement {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int[] num_list = {2, 1, 6};
        int[] num_list = {5, 2, 1, 7, 5};
        System.out.println(s.solution(num_list));
    }
}
class Solution {
    public ArrayList<Integer> solution(int[] num_list) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int i = 0; i < num_list.length; i++){
            answer.add(num_list[i]);
        }
        if (num_list[num_list.length-1] > num_list[num_list.length - 2]){
            int num = num_list[num_list.length-1] - num_list[num_list.length - 2];
            answer.add(num);
        } else if (num_list[num_list.length-1] <= num_list[num_list.length - 2]){
            int tmp =  num_list[num_list.length-1] * 2;
            answer.add(tmp);
        }

        return answer;
    }
}