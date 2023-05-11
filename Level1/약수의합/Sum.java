package Level1.약수의합;

import org.w3c.dom.ls.LSOutput;

import java.util.stream.IntStream;

public class Sum {
    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 12;
        System.out.println(s.solution(n));
    }
}
class Solution {
    public int solution(int n) {
//        int answer = 0;
//        for(int i = 1; i <= n; i++){
//            answer += n % i == 0? i : 0;
//        }
//        return answer;
        return IntStream.rangeClosed(1,12)
                .filter(i -> n % i == 0)
                .sum();
    }
}