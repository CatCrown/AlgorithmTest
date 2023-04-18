package Level0.칠의개수;

public class SevenCount {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] array = {7, 77, 17};
        System.out.println(s.solution(array));
    }
}
class Solution {
    public int solution(int[] array) {
        int answer = 0;

        StringBuffer sb = new StringBuffer();
        for (int i = 0 ;  i < array.length; i++){
            sb.append(array[i]);
        }

        System.out.println(sb);

        for (int i = 0 ;  i < sb.length(); i++){
            if (sb.charAt(i) == '7'){
                answer ++ ;

            }
        }
        System.out.println(answer);
        return answer;
    }
}
