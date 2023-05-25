package Level0.두수의합;

import java.math.BigInteger;
import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        Solution s = new Solution();
        String a = "18446744073709551615";
        String b = "287346502836570928366";
        System.out.println(s.solution(a,b));
    }
}
class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigInteger newA = new BigInteger(a);
        BigInteger newB = new BigInteger(b);
        BigInteger sum = newA.add(newB);
        answer = sum.toString();

        return answer;
    }
}