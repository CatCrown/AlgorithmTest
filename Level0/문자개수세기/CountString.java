package Level0.문자개수세기;

// 알파벳 대소문자로만 이루어진 문자열 my_string이 주어질 때,
// my_string에서 'A'의 개수, my_string에서 'B'의 개수,..., my_string에서 'Z'의 개수,
// my_string에서 'a'의 개수, my_string에서 'b'의 개수,...,my_string에서 'z'의 개수를
// 순서대로 담은 길이 52의 정수 배열을 return 하는 solution 함수를 작성해 주세요.
import java.util.ArrayList;

public class CountString {
    public static void main(String[] args) {
        Solution s = new Solution();
        String my_string = "Programmers";
        System.out.println(s.solution(my_string));
    }
}
class Solution {
    public ArrayList<Integer> solution(String my_string) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int j = 65; j <= 90; j++){
            int count = 0;
            for (int i = 0; i < my_string.length(); i++) {
                if (my_string.charAt(i) == j) {
                    count++;
                }
            }
            answer.add(count);
        }
        for (int j = 97; j <= 122; j++){
            int count = 0;
            for (int i = 0; i < my_string.length(); i++) {
                if (my_string.charAt(i) == j) {
                    count++;
                }
            }
            answer.add(count);
        }
        System.out.println(answer.size());
        return answer;
    }
}