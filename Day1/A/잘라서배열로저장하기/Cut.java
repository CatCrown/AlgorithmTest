package Day1.A.잘라서배열로저장하기;

import java.util.Arrays;

public class Cut {
    public static void main(String[] args) {
        Solution s = new Solution();
//        String my_str = "abc1Addfggg4556b";
        String my_str = "abcdef123";
//        int n = 6;
        int n = 3;
        System.out.println(Arrays.toString(s.solution(my_str,n)));
    }
}

class Solution {
    public String[] solution(String my_str, int n) {


        int cnt =  my_str.length() % n == 0 ? my_str.length()/n: my_str.length()/n+1;
        String[] answer = new String[cnt]; // 배열 크기
        System.out.println("배열길이 = " + answer.length);

        int j = 0;

        for (int i = 0; i < cnt-1; i++) {
            String sub1 = my_str.substring(j, j + n);
            answer[i] = sub1;
            j = j + n;
            System.out.printf("sub1 = %s , i = %d , j = %d%n", sub1, i, j);
        }
        String sub1 = my_str.substring(j);
        answer[cnt-1] = sub1;

        return answer;
    }
}
