package Level0.최빈값구하기;

import java.util.*;


public class Frequent {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int[] array = {1, 2, 3, 3, 3, 4};
//        int[] array = {1, 1, 2, 2};
        int[] array = {1};
        System.out.println(s.solution(array));
    }
}
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        // 중복된 값의 개수를 저장할 맵
        Map<Integer, Integer> countMap = new HashMap<>();

        if (array.length == 1){
            answer = array[0];
        }else {
            // 배열 순회하여 중복된 값의 개수 계산
            for (int num : array) {
                // 맵에 이미 해당 값이 존재하는 경우
                if (countMap.containsKey(num)) {
                    int count = countMap.get(num);
                    countMap.put(num, count + 1);
                } else {
                    // 맵에 해당 값이 존재하지 않는 경우
                    countMap.put(num, 1);
                }
            }
            System.out.println(countMap);
            int maxCount = Collections.max(countMap.values());
            // Collections.frequency()으로 특정 요소(element)의 빈도수를 계산
            boolean hasDuplicates = Collections.frequency(countMap.values(),maxCount) > 1;
            if (hasDuplicates){
                answer = -1;
            }else {
                answer = maxCount;
            }
        }
        return answer;
    }
}