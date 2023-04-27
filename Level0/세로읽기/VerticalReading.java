package Level0.세로읽기;

import java.util.ArrayList;

// 문자열 my_string과 두 정수 m, c가 주어집니다. my_string을 한 줄에 m 글자씩 가로로 적었을 때
// 왼쪽부터 세로로 c번째 열에 적힌 글자들을 문자열로 return 하는 solution 함수를 작성해 주세요.
public class VerticalReading {
    public static void main(String[] args) {
        Solution s = new Solution();
        String my_string = "ihrhbakrfpndopljhygc";
        int m = 4;
        int c = 2;
        System.out.println(s.solution(my_string,m,c));
    }
}
class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";

        ArrayList<String> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer(my_string);
        int i = 0;
        while (i < sb.length()) {
            String str = sb.substring(i,i+m);
//            System.out.println(str);
            list.add(str);
            i = i + m;
        }
        System.out.println(list);
        for (int j = 0; j < list.size(); j++){
            char ch = list.get(j).charAt(c-1);
//            System.out.printf("ch = %c%n", ch);
            answer += ch;
        }
        return answer;
    }
}