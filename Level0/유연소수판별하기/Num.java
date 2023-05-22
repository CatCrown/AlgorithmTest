package Level0.유연소수판별하기;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Num {
    public static void main(String[] args) {
        Solution s = new Solution();
        int a = 1;
        int b = 6;
        System.out.println(s.solution(a,b));
    }
}
class Solution {
    public int solution(int a, int b) {
        Double db = (double) a / (double) b;

        String dbStr = String.valueOf(db);
        System.out.println(dbStr);

        String[] split = dbStr.split("");
        System.out.println(Arrays.deepToString(split));

        return split.length >= 16 ? 2 : 1;
    }
}