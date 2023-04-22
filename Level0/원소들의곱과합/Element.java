package Level0.원소들의곱과합;

// 정수가 담긴 리스트 num_list가 주어질 때,
// 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을
// 크면 0을 return하도록 solution 함수를 완성해주세요.
public class Element {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int[] num_list ={3, 4, 5, 2, 1};
        int[] num_list ={5, 7, 8, 3};
        System.out.println(s.solution(num_list));
    }
}
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int m = num_list[0]; // 모든 원소의 곱
        int sum = 0;
        for (int i = 1; i < num_list.length; i++){
            m = m * num_list[i];
        }
        for (int j = 0; j < num_list.length; j++) {
            sum += num_list[j];
        }
        int n = (int) Math.pow(sum,2); // 합의 제곱

        if (m < n){
            answer = 1;
        }else {
            answer = 0;
        }

        return answer;
    }
}