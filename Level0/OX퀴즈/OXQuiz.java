package Level0.OX퀴즈;

// 덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다.
// 수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.

import java.util.Arrays;

public class OXQuiz {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] quiz = new String[]{"3 - 4 = -3", "5 + 6 = 11"};
        System.out.println(Arrays.toString(s.solution(quiz)));
    }
}
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] replace = quiz[i].split(" ");

            int num1 = Integer.parseInt(replace[0]);
            int num2 = Integer.parseInt(replace[2]);
            int num3 = Integer.parseInt(replace[4]);

            if (replace[1].equals("+")){
                int num = num1 + num2;
                if(num == num3){
                    answer[i] = "O";
                }else {
                    answer[i] = "X";
                }
            }
            if (replace[1].equals("-")){
                int num = num1 - num2;
                if(num == num3){
                    answer[i] = "O";
                }else {
                    answer[i] = "X";
                }
            }
        }

        return answer;
    }
}
