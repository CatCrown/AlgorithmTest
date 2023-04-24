package Level0.수열과구간쿼리4;

// 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다.
// queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
//
//각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 i가 k의 배수이면 arr[i]에 1을 더합니다.
//
//위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.

import java.util.ArrayList;
import java.util.Arrays;

public class ProgressionAndQuarry4 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {0, 1, 2, 4, 3};
//        int[] arr = {1, 3, 7, 2, 6, 8, 6};
        int[][] queries = {{0, 4, 1},{0, 3, 2},{0, 3, 3}};
//        int[][] queries = {{0, 4, 2}, {3, 6, 4}, {2, 3, 5}};
        System.out.println(Arrays.toString(s.solution(arr,queries)));
    }
}
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            System.out.printf("s = %d, e = %d, k = %d%n",s,e,k);

            for (int j = s; j < e+1; j++){
                if (j % k == 0){
                    arr[j] += 1;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

        return arr;
    }
}