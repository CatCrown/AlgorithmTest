package Level0.왼쪽오른쪽;

import java.util.ArrayList;

// 문자열 리스트 str_list에는 "u", "d", "l", "r" 네 개의 문자열이 여러 개 저장되어 있습니다.
// str_list에서 "l"과 "r" 중 먼저 나오는 문자열이 "l"이라면 해당 문자열을 기준으로 왼쪽에 있는 문자열들을 순서대로 담은 리스트를,
// 먼저 나오는 문자열이 "r"이라면 해당 문자열을 기준으로 오른쪽에 있는 문자열들을 순서대로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
// "l"이나 "r"이 없다면 빈 리스트를 return합니다.
public class LeftRight {
    public static void main(String[] args) {
        Solution s = new Solution();
//        String[] str_list = {"u", "u", "l", "r"};
        String[] str_list = {"u", "d","l" ,"r","u"};
//        String[] str_list = {"l"};
        System.out.println(s.solution(str_list));
    }
}
class Solution {
    public ArrayList<String> solution(String[] str_list) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < str_list.length; i++){
            if (str_list[i].equals("l")){
                for (int j = 0; j < i; j++){
                    list.add(str_list[j]);
                }
                break;
            } else if (str_list[i].equals("r")) {
                for (int j = i+1; j < str_list.length; j++){
                    list.add(str_list[j]);
                }
                break;
            }
        }
        return list;
    }
}