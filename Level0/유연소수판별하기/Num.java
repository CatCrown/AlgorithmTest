package Level0.유연소수판별하기;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Num {
    public static void main(String[] args) {
        Solution s = new Solution();
        int a = 1;
        int b = 1;
        System.out.println(s.solution(a,b));
    }
}
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        BigInteger bigIntegerA = new BigInteger(String.valueOf(a));
        BigInteger bigIntegerB = new BigInteger(String.valueOf(b));
        BigInteger gcd = bigIntegerA.gcd(bigIntegerB);
        System.out.println(gcd);

        BigInteger newA = bigIntegerA.divide(gcd);
        BigInteger newB = bigIntegerB.divide(gcd);
        System.out.println(newB);

//        BigInteger sqrt = BigInteger.valueOf(newB.shortValue());
//        System.out.println("제곱근"+sqrt);
        List<Integer> list = new ArrayList<>();
        int num = newB.intValue();
        for (int i = 2; i <=num; i++){
            while ( num % i == 0){
                list.add(i);
                num = num / i;
            }
        }
        System.out.println(list);

        // 소인수 중에 2와 5가 있는지 확인합니다.
        boolean hasTwo = false;
        boolean hasFive = false;
        for (int factor : list) {
            if (factor == 2) {
                hasTwo = true;
            } else if (factor == 5) {
                hasFive = true;
            }
        }

        if(hasTwo || hasFive){
            answer = 1;
        }else {
            answer = 2;
        }

        return answer;
    }
}