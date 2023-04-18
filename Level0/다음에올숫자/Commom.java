package Level0.다음에올숫자;

/*
* 등차수열 혹은 등비수열 common이 매개변수로 주어질 때,
* 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
* */

public class Commom {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] common = {1,2,3,4};
//        int[] common = {2,4,8};
//        int[] common = {10,8,6,4};
        System.out.println(s.solution(common));
    }
}

class Solution {
    public int solution(int[] common) {
        int answer = 0;
        // 등차수열?등비수열?
        if(common[1]-common[0] == common[2]-common[1]){
            // 등차수열
            int tmp = common[1]-common[0];
            answer = common[common.length-1] + tmp;
        }else{
            // 등비수열
            int tmp = common[1] / common[0];
            answer = common[common.length-1] * tmp;
        }
        return answer;
    }

}