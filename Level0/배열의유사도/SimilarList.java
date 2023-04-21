package Level0.배열의유사도;

public class SimilarList {
    public static void main(String[] args) {
        Solution s = new Solution();
//        String[] s1 = {"a", "b", "c"};
        String[] s1 = {"n", "omg"};
//        String[] s2 = {"com", "b", "d", "p", "c"};
        String[] s2 = {"m", "dot"};
        System.out.println(s.solution(s1,s2));
    }
}

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (int i = 0; i < s1.length; i++){
            for (int j = 0; j < s2.length; j++){
                if(s1[i].equals(s2[j])){
                    answer++;
                }
            }
        }
        return answer;
    }
}
