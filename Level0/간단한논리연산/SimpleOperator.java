package Level0.간단한논리연산;

// boolean 변수 x1, x2, x3, x4가 매개변수로 주어질 때,
// 다음의 식의 true/false를 return 하는 solution 함수를 작성해 주세요.
//
//(x1 ∨ x2) ∧ (x3 ∨ x4)
public class SimpleOperator {
    public static void main(String[] args) {
        Solution s = new Solution();
//        boolean x1 = false;
        boolean x1 = true;
//        boolean x2 = true;
        boolean x2 = false;
//        boolean x3 = true;
        boolean x3 = false;
//        boolean x4 = true;
        boolean x4 = false;
        System.out.println(s.solution(x1,x2,x3,x4));

    }
}
class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean x12 = false;
        if (x1 == x2){
            x12 = x1;
        } else if (x1 != x2) {
            x12 = true;
        }
        boolean x34 = false ;
        if (x3 == x4){
            x34 = x3;
        } else if (x3 != x4) {
            x34 = true;
        }
        boolean x1234 = false ;
        if (x12 == x34){
            x1234 = x12;
        } else if (x12 != x34) {
            x1234 = false;
        }
        answer = x1234;
        return answer;
    }
}