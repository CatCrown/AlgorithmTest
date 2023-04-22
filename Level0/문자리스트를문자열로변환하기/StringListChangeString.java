package Level0.문자리스트를문자열로변환하기;
// 문자들이 담겨있는 배열 arr가 주어집니다.
// arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
public class StringListChangeString {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] arr = {"a","b","c"};
        System.out.println(s.solution(arr));
    }

}

class Solution {
    public String solution(String[] arr) {
        String answer = "";
        for (int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        return answer;
    }
}
