package Level0.자릿수더하기;


// 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요

import java.util.Arrays;

public class NumPlus {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int n = 1234;
        int n = 930211;
        System.out.println(s.solution(n));
    }
}

class Solution {
    public int solution(int n) {
        int m = n;
        int sum = 0;
        String str = Integer.toString(m);
        for (int i = 0 ; i < str.length(); i++) {
            int a = m % 10;
            m = m / 10;
            sum = sum + a;
        }
        return sum;
    }
}
