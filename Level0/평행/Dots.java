package Level0.평행;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Dots {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] dots ={{0,0}, {1,1}, {2,2}, {3,3}};// 1
        int[][] dots1 = {{3, 5}, {4, 1}, {2, 4}, {5, 10}}; // 0
        int[][] dots2 = {{3,0}, {0,3}, {2,1}, {1,2}}; // 1
        int[][] dots3 = {{1, 1}, {4, 2}, {5, 5}, {7, 7}}; // 1
        int[][] dots4 = {{0,0}, {1, 2}, {3,1}, {2,3}}; // 1
        System.out.println(s.solution(dots));
        System.out.println(s.solution(dots1));
        System.out.println(s.solution(dots2));
        System.out.println(s.solution(dots3));
        System.out.println(s.solution(dots4));

    }
}
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        Arrays.sort(dots, (a, b) -> a[0] - b[0]); // x 기준으로 정렬

        outerloop: //레이블(Label)을 사용
        for(int i = 0; i < dots.length-1 ; i++){

            for (int j = i + 1; j < dots.length; j++) {
                if (answer==1) break;

                int x1 = dots[i][0];
                int y1 = dots[i][1];
                int x2 = dots[j][0];
                int y2 = dots[j][1];

                double slope1 = (double) (y1 - y2) / (x1 - x2);
//                System.out.printf("i = %d,j = %d, slope1 = %f%n ",i,j,slope1);

                for(int z = 0; z < dots.length; z++){
                    if(z == i || z == j) continue;
                    for(int x = 0; x < dots.length; x++){
                        if (x == i || x == j || x == z) continue;
                        int x3 = dots[z][0];
                        int y3 = dots[z][1];
                        int x4 = dots[x][0];
                        int y4 = dots[x][1];
                        double slope2 = (double) (y3 - y4) / (x3 - x4);
//                        System.out.printf("z = %d,x = %d, slope2 = %f%n ",z,x,slope2);
                        if (slope1 == slope2){
                            answer = 1;
                            break outerloop; // 레이블(Label)을 사용하여 반복문 빠져나기
                        }
                    }
                }
            }
        }
        return answer;
    }
}