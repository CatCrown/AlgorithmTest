package Level0.flag에따라다른값반환하기;
// 두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때,
// flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.
public class Flag {
    public static void main(String[] args) {
        Solution s = new Solution();
        int a = -4;
        int b = 7;
        boolean flag = false;
        System.out.println(s.solution(a,b,flag));
    }
}
class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if (flag == true) {
            answer = a + b;
        } else if (flag == false) {
            answer = a - b;
        }
        return answer;

    }
}