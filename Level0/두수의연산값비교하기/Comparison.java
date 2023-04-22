package Level0.두수의연산값비교하기;

//연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
//
//12 ⊕ 3 = 123
//3 ⊕ 12 = 312
//양의 정수 a와 b가 주어졌을 때,
// a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
//
//단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.

public class Comparison {
    public static void main(String[] args) {
        Solution s = new Solution();
        int a =  2;
        int b = 91;
        System.out.println(s.solution(a,b));
    }
}


class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String strA = Integer.toString(a);
        String strB = Integer.toString(b);
        String strAB = strA + strB;
        int ab = Integer.parseInt(strAB);
        int ab2 = 2 * a * b;
        answer = ab >= ab2 ? ab : ab2;

        return answer;
    }
}