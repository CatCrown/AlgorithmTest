package Level0.종이자르기;

/*머쓱이는 큰 종이를 1 x 1 크기로 자르려고 합니다.
예를 들어 2 x 2 크기의 종이를 1 x 1 크기로 자르려면 최소 가위질 세 번이 필요합니다.*/
public class CutPaper {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int M = 2;
//        int N = 2;
//        int M = 2;
//        int N = 5;
        int M = 1;
        int N = 1;
        System.out.println(s.solution(M,N));
    }
}

class Solution {
    public int solution(int M, int N) {
        int answer = 0;

        int count = M-1; // M의 짜르기 횟수
        int num = (N-1) * M;; // N의 짜르기 횟수
        answer = count + num;

        return answer;
    }
}
