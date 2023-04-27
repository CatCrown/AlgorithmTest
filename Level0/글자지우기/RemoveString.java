package Level0.글자지우기;

import java.util.Arrays;

// 문자열 my_string과 정수 배열 indices가 주어질 때,
// my_string에서 indices의 원소에 해당하는 인덱스의 글자를 지우고
// 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
public class RemoveString {
    public static void main(String[] args) {
        Solution s = new Solution();
//        String my_string = "apporoograpemmemprs";
        String my_string = "abcde";
        int[] indices = {1};
        System.out.println(s.solution(my_string,indices));
    }
}
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        Arrays.sort(indices);
        if (indices[0] != 0){
            StringBuffer newSS = new StringBuffer(my_string.substring(0,indices[0]));
            answer += newSS;
        }

        for (int i = 1; i < indices.length; i++){
            StringBuffer newStr = new StringBuffer(my_string.substring(indices[i-1],indices[i]));
            if (newStr != null || newStr.length() > 1) {
                newStr.deleteCharAt(0);
                System.out.println(newStr);
                answer += newStr;
            }
        }
        StringBuffer SS = new StringBuffer(my_string.substring(indices[indices.length-1]));
        if (SS != null || SS.length() > 1) {
            SS.deleteCharAt(0);
            answer += SS;
            System.out.println(SS);
        }
        return answer;
    }
}