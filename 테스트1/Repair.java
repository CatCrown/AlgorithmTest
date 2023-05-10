package 테스트1;

import java.util.*;
import java.util.stream.Stream;

public class Repair {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int n = 6;
        int n = 4;
//        int[][] network = {{1,2},{3,5},{4,2},{5,6}};
        int[][] network = {{1,2}};
        int[][] repair = {{2,3,10},{3,1,12}};
        System.out.println(s.Solution(n,network,repair));

    }
}
class Solution {
    public int Solution(int n, int[][] network, int[][] repair){
        int answer = -2;
        int[][] newRepair = Arrays.stream(repair)
                .map(arr -> Arrays.copyOfRange(arr,0,2))
                .toArray(int[][]::new);
        System.out.println(Arrays.deepToString(newRepair));

        boolean flat = Stream.of(network,newRepair)// 하나의 스트림으로 결합
                .flatMap(Arrays::stream)// 각요소를 1차원 배열로 변환
                .flatMapToInt(Arrays::stream) // 모든 정수 요소를 하나의 IntStream으로 변환
                .distinct() // 중복제거
                .count() == n; // 1~n까지 숫자 있는지 확인
        System.out.println(flat);

        if (flat == true){
            int[] cost = Arrays.stream(repair)
                    .mapToInt(arr -> arr[2])
                    .toArray();
            System.out.println(Arrays.toString(cost));
            answer = Arrays.stream(cost)
                    .min()
                    .orElseThrow(NoSuchElementException::new);
        }else {
            answer = -1;
        }

        return answer;
    }

}