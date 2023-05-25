package Level0.편지;

public class message {
    public static void main(String[] args) {
        Solution s = new Solution();
        String message = "happy birthday!";
        System.out.println(s.solution(message));
    }
}
class Solution {
    public int solution(String message) {
        int answer = 0;
        answer = message.length() * 2;
        return answer;
    }
}