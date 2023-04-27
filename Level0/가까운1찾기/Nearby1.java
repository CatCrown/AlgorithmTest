package Level0.가까운1찾기;

// 정수 배열 arr가 주어집니다. 이때 arr의 원소는 1 또는 0입니다.
// 정수 idx가 주어졌을 때, idx보다 크면서 배열의 값이 1인 가장 작은 인덱스를 찾아서 반환하는 solution 함수를 완성해 주세요.
//
//단, 만약 그러한 인덱스가 없다면 -1을 반환합니다.
public class Nearby1 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1, 1, 1, 1};
        int idx = 0;
        System.out.println(s.solution(arr,idx));
    }
}
class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        for (int i = idx; i < arr.length; i++){
            if (arr[i] == 1 && i == 0){
                answer = i;
                return answer;
            }

            if (arr[i] == 1){
                answer = i;
                break;
            }
        }
        if (answer == 0){
            answer = -1;
        }
        return answer;
    }
}