package Level0.최빈값구하기;

//import java.util.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
public class Frequent {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int[] array = {1, 2, 3, 3, 3, 4};
//        int[] array = {1, 1, 2, 2};
//        int[] array = {1};
        int[] array = {1, 3, 7, 2, 6, 8, 6};

        System.out.println(s.solution(array));
    }
}

class Solution {
    public int solution(int[] array) {
        List<Map.Entry<Integer, List<Integer>>> list = new ArrayList<>(Arrays.stream(array)
                .boxed()// 주어진 array를 boxed() 메서드를 통해 IntStream을 Stream<Integer>로 변환
                .collect(Collectors.groupingBy(o -> o))// 각 숫자의 빈도를 계산하고, 같은 값들을 그룹화 , 이를 통해 Map<Integer, List<Integer>> 형태의 맵이 생성됩니다.
                .entrySet()) //맵의 모든 엔트리를 가져옴
                .stream() // 엔트리 스트림을 생성
                .sorted((t0, t1) -> Integer.compare(t1.getValue().size(),t0.getValue().size())) // 빈도 내림차순으로 정렬
                .collect(Collectors.toList()); //빈도 내림차순으로 정렬. 빈도 높은 값이 제일 위쪽에 있음
        System.out.println(list.get(0).getValue().size());
        return list.size() > 1 && list.get(0).getValue().size() - list.get(1).getValue().size() == 0 ? -1 : list.get(0).getKey();
//        가장 빈도가 높은 값과 두 번째로 빈도가 높은 값의 빈도 차이로 최빈값이 여러개인지 확인
    }
}

//class Solution {
//    public int solution(int[] array) {
//        int answer = 0;
//        // 중복된 값의 개수를 저장할 맵
//        Map<Integer, Integer> countMap = new HashMap<>();
//
//        if (array.length == 1){
//            answer = array[0];
//        }else {
//            // 배열 순회하여 중복된 값의 개수 계산
//            for (int num : array) {
//                // 맵에 이미 해당 값이 존재하는 경우
//                if (countMap.containsKey(num)) {
//                    int count = countMap.get(num);
//                    countMap.put(num, count + 1);
//                } else {
//                    // 맵에 해당 값이 존재하지 않는 경우
//                    countMap.put(num, 1);
//                }
//            }
////            System.out.println(countMap);
//
//            int maxCount = Collections.max(countMap.values());
////            System.out.println("maxCount = " + maxCount);
//
//            // Collections.frequency()으로 특정 요소(element)의 빈도수를 계산
//            int hasDuplicates = Collections.frequency(countMap.values(),maxCount);
//            System.out.println("hasDuplicates = " + hasDuplicates);
//
//            if (hasDuplicates > 1){
//                answer = -1;
//            }else {
//                // maxCount의 키값을 구하기
//                for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
//                    if (entry.getValue() == maxCount) {
//                        answer = entry.getKey();
//                        break;
//                    }
//                }
//            }
//        }
//        return answer;
//    }
//}