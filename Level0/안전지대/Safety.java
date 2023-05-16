package Level0.안전지대;

import java.util.Arrays;

public class Safety {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
//        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {1, 1, 1, 1, 1}};
        System.out.println(s.solution(board));
    }

}
class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] copy = Arrays.stream(board)
                .map(int[]::clone)
                .toArray(int[][]::new);

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == 1){
                    if (i-1 > 0 && copy[i-1][j] != 1){// 위쪽
                        copy[i-1][j] = 2;}// 위쪽
                    if (i+1 < board.length && copy[i+1][j] != 1){
                        copy[i+1][j] = 2;} //아래쪽
                    if (j-1 > 0 && copy[i][j-1] != 1){
                        copy[i][j-1] = 2;} //왼쪽
                    if (j+1 < board[i].length && copy[i][j+1] != 1){
                        copy[i][j+1] = 2;} //오른쪽
                    if (i-1 > 0 && j-1 > 0 && copy[i-1][j-1] != 1){
                        copy[i-1][j-1] = 2;} // 왼쪽 위쪽
                    if (i-1 > 0 && j+1 < board[i].length && copy[i-1][j+1] != 1){
                        copy[i-1][j+1] = 2;} //오른쪽 위쪽
                    if (i+1 < board.length && j-1 > 0 && copy[i+1][j-1] != 1){
                        copy[i+1][j-1] = 2;}// 왼쪽 아래
                    if (i+1 < board.length && j+1 < board[i].length && copy[i+1][j+1] != 1){
                        copy[i+1][j+1] = 2;} // 오른쪽 아래
                }
            }
        }
        System.out.println(Arrays.deepToString(copy));

        int[] num = Arrays.stream(copy)
                .flatMapToInt(Arrays::stream)
                .filter(n -> n == 0)
                .toArray();

        answer = num.length;
        return answer;
    }
}