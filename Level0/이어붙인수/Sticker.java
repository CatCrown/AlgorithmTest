package Level0.이어붙인수;

// 정수가 담긴 리스트 num_list가 주어집니다.
// num_list의 홀수만 순서대로 이어 붙인 수와
// 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
public class Sticker {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num_list = {3, 4, 5, 2, 1};
        System.out.println(s.solution(num_list));
    }
}
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String m = ""; // 짝수
        String n = ""; // 홀수
        for (int i = 0; i < num_list.length; i++){
            if (num_list[i] % 2 == 0){
                m +=  Integer.toString(num_list[i]);
            }else if (num_list[i] % 2 != 0){
                n +=  Integer.toString(num_list[i]);
            }
        }
        int mm = Integer.parseInt(m);
        int nn = Integer.parseInt(n);
        answer = mm + nn;

        return answer;
    }
}