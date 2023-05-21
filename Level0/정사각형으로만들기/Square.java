package Level0.정사각형으로만들기;

import java.util.Arrays;

public class Square {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] arr = {{572, 22, 37}, {287, 726, 38}, {85, 137, 292}, {487, 13, 876}};
        int[][] arr1 = {{57, 192, 534, 2},{9, 345, 192, 999}};
        int[][] arr2 = {{1, 2},{3, 4}};
        int[][] arr3 = {{1,2,3}};
        int[][] arr4 = {{1},{1}};
        System.out.println(Arrays.deepToString(s.solution(arr)));
        System.out.println(Arrays.deepToString(s.solution(arr1)));
        System.out.println(Arrays.deepToString(s.solution(arr2)));
        System.out.println(Arrays.deepToString(s.solution(arr3)));
        System.out.println(Arrays.deepToString(s.solution(arr4)));
    }
}
class Solution {
    public int[][] solution(int[][] arr) {
        if(arr.length==arr[0].length){
            return arr;
        }
        int answerSize = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[answerSize][answerSize];
        for(int x=0;x<arr.length;x++){
            for(int y=0;y<arr[0].length;y++){
                answer[x][y]=arr[x][y];
            }
        }

        return answer;
    }
}