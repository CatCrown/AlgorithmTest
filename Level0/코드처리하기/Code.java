package Level0.코드처리하기;

public class Code {
    public static void main(String[] args) {
        Solution s = new Solution();
        String code = "abc1abc1abc";
        System.out.println(s.solution(code));
    }
}
class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for (int i = 0; i < code.length(); i++){
            if (mode == 0){
                if (code.charAt(i) != '1' && i % 2 == 0){
                    answer += code.charAt(i);
                } else if (code.charAt(i) == '1') {
                    mode = 1;
                }
            }else if (mode == 1){
                if (code.charAt(i) != '1' && i % 2 != 0){
                    answer += code.charAt(i);
                } else if (code.charAt(i) == '1') {
                    mode = 0;
                }
            }
        }
        if (answer.isEmpty()){
            answer = "EMPTY";
        }

        return answer;
    }
}