package Level0.등수매기기;

import java.util.*;
//import java.util.stream.Collectors;

public class Score {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        int[][] score = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
        System.out.println(Arrays.toString(s.solution(score)));
    }
}
class Solution {
    public int[] solution(int[][] score) {
        List<Integer> scoreList = new ArrayList<>();
        for(int[] t : score){
            scoreList.add(t[0] + t[1]);
        }
        scoreList.sort(Comparator.reverseOrder());

        int[] answer = new int[score.length];
        for(int i=0; i<score.length; i++){
            answer[i] = scoreList.indexOf(score[i][0] + score[i][1])+1;
        }
        return answer;
    }

}