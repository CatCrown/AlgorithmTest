package Level0.정수를나선형으로배치하기;


import java.util.Arrays;

// 양의 정수 n이 매개변수로 주어집니다. n × n 배열에 1부터 n2 까지
// 정수를 인덱스 [0][0]부터 시계방향 나선형으로 배치한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.
public class HelicalForm {
    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 4;
        System.out.println(Arrays.toString(s.solution(n)));
    }
}
class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int row = 0; // 행 인덱스
        int col = 0; // 열 인덱스
        int num = 1; // 채워넣을 숫자

        for(int i = n; i > 0; i -= 2){
            // 오른쪽 방향
            for (int j = 0; j < i; j++){
                answer[row][col] = num;
                System.out.printf("오른쪽 방향 : answer[%d][%d] = %d%n", row,col,num);
                col++;
                num++;
            }
            row++;
            col--;
            System.out.printf("아래방향으로 전환 : row = %d, col = %d; num = %d%n", row,col,num);

            // 아래 방향
            for (int j = 0; j < i-1; j++){
                answer[row][col] = num;
                System.out.printf("아래방향 :answer[%d][%d] = %d%n", row,col,num);
                row++;
                num++;
            }
            col--;
            row--;
            System.out.printf("왼쪽방향으로 전환 : row = %d, col = %d; num = %d%n", row,col,num);
            // 왼쪽 방향
            for (int j = 0; j < i-1; j++){
                answer[row][col] = num;
                System.out.printf("왼쪽방향 : answer[%d][%d] = %d%n", row,col,num);
                col--;
                num++;
            }
            row--;
            col++;
            System.out.printf("위쪽방향으로 전환 : row = %d, col = %d; num = %d%n", row,col,num);
            // 위쪽 방향
            for (int j = 0; j < i-2; j++){
                answer[row][col] = num;
                System.out.printf("위쪽방향 : answer[%d][%d] = %d%n", row,col,num);
                row--;
                num++;
            }
            col++;
            row++;
            System.out.printf("오른쪽방향으로 전환 : row = %d, col = %d; num = %d%n", row,col,num);

        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}