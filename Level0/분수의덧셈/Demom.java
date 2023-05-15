package Level0.분수의덧셈;

import java.math.BigInteger;

public class Demom {
    public static void main(String[] args) {
        Solution s = new Solution();
        int numer1 = 1;
        int denom1 = 2;
        int numer2 = 3;
        int denom2 = 4;
        System.out.println(s.solution(numer1,denom1,numer2,denom2));
    }
}
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;

        BigInteger n = BigInteger.valueOf(numer);
        BigInteger d = BigInteger.valueOf(denom);
        int gcd = n.gcd(d).intValue();
        System.out.println("최대공약수 = " + gcd);

        answer[0] = numer/gcd;
        answer[1] = denom/gcd;


        return answer;
    }
}