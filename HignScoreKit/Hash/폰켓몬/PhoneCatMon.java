package HignScoreKit.Hash.폰켓몬;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PhoneCatMon {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3,1,2,3};
        System.out.println(s.solution(nums));
    }
}


class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        // 가져갈 수 있는 수
        int n = nums.length/2;

        Set<Integer> hashSet = new HashSet<>(Arrays.asList());
        int count = 0;
        for (int i = 0; i<nums.length;i++){
            if (!hashSet.contains(nums[i])){
                hashSet.add(nums[i]); // hashset에 nums 요소들을 저장한다.
                count ++ ;
            }


        }
        System.out.println(hashSet);


        return answer;
    }
}