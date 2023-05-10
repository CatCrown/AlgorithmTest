package 테스트;

import java.util.Arrays;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] boxes = {1000, 800, 900};
//        int[] boxes = {9000,10000,8520,9500};
        int m = 1000000;
//        int m = 110000;
        int k = 3;
//        int k = 4;
        System.out.println(s.solution(boxes,m,k));

    }
}
class Solution{
    public int solution(int[] boxes, int m, int k){
        int answer = 0;
        Integer[] newboxes = Arrays.stream(boxes).boxed().toArray(Integer[]::new);
        Arrays.sort(newboxes,Collections.reverseOrder());
        // System.out.println(Arrays.toString(newboxes));

        for (int j = 0; j < k; j++){
            for (int i = 0; i < newboxes.length; i++){
                int get = m / 10000 * newboxes[i];
                System.out.println("get = " + get);
                if(get <= 100000){
                    m += get;
                    System.out.println("m = " + m);
                    break;
                }
            }
        }
        answer = m;
        return answer;
    }
}