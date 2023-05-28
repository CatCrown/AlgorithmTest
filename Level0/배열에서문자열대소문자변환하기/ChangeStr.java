package Level0.배열에서문자열대소문자변환하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ChangeStr {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] strArr = {"AAA","BBB","CCC","DDD"};
        System.out.println(s.solution(strArr));
    }
}
class Solution {
    public String[] solution(String[] strArr) {
        return IntStream.range(0,strArr.length)
                .mapToObj(i -> i % 2 == 0? strArr[i].toLowerCase() : strArr[i].toUpperCase())
                .toArray(String[]::new);


//        ArrayList<String> answer = new ArrayList<>();
//        for(int i = 0; i < strArr.length; i++){
//            if(i % 2 == 0){
//                String str = strArr[i].toLowerCase();
//                answer.add(str);
//            }else {
//                String str = strArr[i].toUpperCase();
//                answer.add(str);
//            }
//        }
//        return answer;
    }
}