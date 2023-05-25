package Level0.특정문자제거하기;

public class RemoveStr {
    public static void main(String[] args) {
        Solution s = new Solution();
        String my_string = "abcdef";
        String letter = "f";
        System.out.println(s.solution(my_string,letter));
    }
}
class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        answer = my_string.replaceAll(letter,"");
        return answer;
    }
}