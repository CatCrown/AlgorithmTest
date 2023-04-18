package Level0.숫자찾기;

public class FindNumber {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int num = 29183;
        int num = 123456;
//        int k = 1;
        int k = 7;
        System.out.println(s.solution(num,k));
    }
}

class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = Integer.toString(num);
        String newK = Integer.toString(k);
        System.out.println(str);
        int idx = str.indexOf(newK);
        if (idx >= 0){
            answer = idx + 1;
        }else {
            answer = idx;
        }
        return answer;
    }
}
