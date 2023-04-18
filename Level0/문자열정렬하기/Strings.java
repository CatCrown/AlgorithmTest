package Level0.문자열정렬하기;

// 영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때,
// my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        Solution s = new Solution();
        String my_string = "Bcad";
//        System.out.println(Arrays.toString(new String[]{s.solution(my_string)}));
        System.out.println(s.solution(my_string));
    }
}

class Solution {
    public String solution(String my_string) {
        String newString = my_string.toLowerCase();
        char[] chars = newString.toCharArray(); // 문자 배열을 char 타입 배열로 변환
        Arrays.sort(chars); // 정렬하기
        String newChars = new String(chars);// 다시 string으로 변환하여 반환
        newChars.replaceAll(",",""); // 콤마 지워기
        return newChars;
    }
}
