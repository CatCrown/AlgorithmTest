package Level0.수열과구간쿼리2;

// 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다.
// queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
//
//각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 찾습니다.
//
//각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요.
//단, 특정 쿼리의 답이 존재하지 않으면 -1을 저장합니다.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ProgressionAndQuarry2 {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int[] arr = {0, 1, 2, 4, 3};
        int[] arr = {1, 3, 7, 2, 6, 8, 6};
//        int[][] queries = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
        int[][] queries = {{0, 4, 2}, {3, 6, 4}, {2, 3, 5}};
        System.out.println(s.solution(arr,queries));
    }

}
class Solution {
    public ArrayList<Integer> solution(int[] arr, int[][] queries) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            System.out.printf("s = %d, e = %d, k = %d%n",s,e,k);

            ArrayList<Integer> num = new ArrayList<Integer>();
            for (int j = s; j < e+1 ; j++){
                if(arr[j] > k){
                    num.add(arr[j]);
                }
            }
            Collections.sort(num);
            System.out.println(num);
            if (num.size() > 1) {
                answer.add(num.get(0));
                System.out.printf("answer[%d] = %d%n",i,answer.get(i));
            } else if (num.isEmpty()){
                answer.add(-1);
                System.out.printf("answer[%d] = %d%n",i,answer.get(i));
            } else if (num.size() == 1) {
                answer.add(num.get(0));
                System.out.printf("answer[%d] = %d%n",i,answer.get(i));
            }
        }
        return answer;
    }
}