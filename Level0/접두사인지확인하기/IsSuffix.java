package Level0.접두사인지확인하기;

import java.util.ArrayList;
//
//어떤 문자열에 대해서 접두사는 특정 인덱스까지의 문자열을 의미합니다.
// 예를 들어, "banana"의 모든 접두사는 "b", "ba", "ban", "bana", "banan", "banana"입니다.
// 문자열 my_string과 is_prefix가 주어질 때,
// is_prefix가 my_string의 접두사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.
public class IsSuffix {
    public static void main(String[] args) {
        Solution s = new Solution();
        String my_string = "banana";
        String is_prefix = "ban";
        System.out.println(s.solution(my_string,is_prefix));
    }
}
class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer(my_string);
        for (int i = my_string.length(); i >= 0; i--){
            String str = sb.substring(0,i);
            list.add(str);
        }
        int num = 0;
        for (int j = 0; j < list.size(); j++){
            if (list.get(j).equals(is_prefix)){
                num = 1;
                break;
            }
        }
        answer = num;
        return answer;
    }
}