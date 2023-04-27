package Level0.접미사인지확인하기;

import java.util.ArrayList;

// 어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다.
// 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
//문자열 my_string과 is_suffix가 주어질 때, is_suffix가 my_string의 접미사라면 1을,
// 아니면 0을 return 하는 solution 함수를 작성해 주세요.
public class IsSuffix {
    public static void main(String[] args) {
        Solution s = new Solution();
        String my_string = "banana";
        String is_suffix = "ana";
        System.out.println(s.solution(my_string,is_suffix));
    }
}
class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer(my_string);
        for (int i = 0; i < my_string.length(); i++){
            String str = sb.substring(i);
            list.add(str);
        }
        int num = 0;
        for (int j = 0; j < list.size(); j++){
            if (list.get(j).equals(is_suffix)){
                num = 1;
                break;
            }
        }
        answer = num;
        return answer;
    }
}