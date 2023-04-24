package Level0.문자열여러번뒤집기;

// 문자열 my_string과 이차원 정수 배열 queries가 매개변수로 주어집니다.
// queries의 원소는 [s, e] 형태로, my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다.
// my_string에 queries의 명령을 순서대로 처리한 후의 문자열을 return 하는 solution 함수를 작성해 주세요.
public class MixSring {
    public static void main(String[] args) {
        Solution s = new Solution();
        String my_string = "rermgorpsam";
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        System.out.println(s.solution(my_string,queries));
    }
}
class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        String str = my_string;
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb);
        for (int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            StringBuffer part = new StringBuffer(sb.substring(s,e+1)).reverse();
            sb.replace(s,e+1, String.valueOf(part));
            System.out.println(sb);
        }
        answer = String.valueOf(sb);

        return answer;
    }
}