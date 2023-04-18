package Level0.문자열밀기;


/*
* 문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다.
*  이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때,
* A를 밀어서 B가 될 수 있다면 밀어야 하는 최소 횟수를 return하고 밀어서 B가 될 수 없으면 -1을 return 하도록 solution 함수를 완성해보세요.*/

public class PushCount {
    public static void main(String[] args) {
        Solution s = new Solution();
//        String A = "apple";
//        String B = "elppa";
        String A = "apple";
        String B = "elppa";
        System.out.println(s.solution(A,B));
    }
}

class Solution {
    // 천재들의 해결법
        public int solution(String A, String B) {
            return (B + B).indexOf(A);
        }

}
//
//class Solution {
//
//    // 일반인들의 해결법
//    public int solution(String A, String B) {
//        int answer = 0;
//        String newWord = A;
//
//        for (int i = 0; i < A.length(); i++) {
//            if (newWord.equals(B)) {
//                return answer;
//            }
//
//            String end = newWord.substring(newWord.length() - 1); //마지막 글자만을 추출
//            newWord = end + newWord.substring(0, newWord.length() - 1); // 마지막 문자를 제외한 문자열을 반환
//            answer++;
//        }
//
//        return -1;
//    }
//}
