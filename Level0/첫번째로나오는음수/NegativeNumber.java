package Level0.첫번째로나오는음수;

// 정수 리스트 num_list가 주어질 때,
// 첫 번째로 나오는 음수의 인덱스를 return하도록 solution 함수를 완성해주세요.
// 음수가 없다면 -1을 return합니다.
public class NegativeNumber {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int[] num_list = {12, 4, 15, 46, 38, -2, 15};
        int[] num_list = {13, 22, 53, 24, 15, 6};
        System.out.println(s.solution(num_list));
    }
}
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int count = 0;
        for (int i = 0; i < num_list.length; i++){
            if (num_list[i] < 0){
                answer = i;
                count++;
                break;
            }
        }
        if (count == 0){
            answer = -1;
        }
        return answer;
    }
}