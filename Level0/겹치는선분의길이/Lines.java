package Level0.겹치는선분의길이;

import java.util.*;
public class Lines {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] lines = {{0, 1}, {2, 5}, {3, 9}};
        System.out.println(s.solution(lines));
    }
}

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        Arrays.sort(lines, (a,b) -> a[0] - b[0]);

        for(int i = 0; i < lines.length-1; i++){
            int start = lines[i][0];
            int end = lines[i][1];
            for(int j = i+1; j < lines.length; j++){
                int start1 = lines[j][0];
                int end1 = lines[j][1];
                if(start <= start1 && start1 < end  && end <= end1){
                    answer += end - start1;
                }else if(start <= start1 && start1 < end  && end >= end1){
                    answer += end1 - start1;
                }else if(start >= start1 && start < end1 && end >= end1 ){
                    answer += end1 - start;
                }else if(start >= start1 && start < end1 && end <= end1){
                    answer += end - start;
                }
            }
        }

        int endMin = Arrays.stream(lines)
                .mapToInt(l -> l[1])
                .min()
                .orElse(0);

        if(lines[0][0] <= lines[1][0] && lines[1][0] <= lines[2][0] && lines[2][0] < endMin){
            answer -= 2 * (endMin - lines[2][0]);
        }

        return answer;
    }
}