package Level0.등차수열의특정한항만더하기;
// 두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다.
// 첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때,
// 이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.

public class Arithmetical {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int a = 3;
        int a = 7;
//        int d = 4;
        int d = 1;
//        boolean[] included = {true, false, false, true, true};
        boolean[] included = {false, false, false, true, false, false, false};
        System.out.println(s.solution(a,d,included));
    }
}
class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] num = new int[included.length];
        for (int i = 0; i < included.length; i++){
            num[i] = a + d * i;
        }
        for (int j = 0; j < included.length; j++) {
            if (included[j] == true) {
                answer += num[j];
            }
        }
        return answer;
    }
}