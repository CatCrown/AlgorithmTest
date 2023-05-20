package Level0.특이한정렬;

import java.util.*;
import java.util.stream.Collectors;

public class Numlist {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numlist = {1, 2, 3, 4, 5, 6};
        int n = 4;
        System.out.println(s.solution(numlist,n));
    }
}

class Solution {
    public int[] solution(int[] numList, int n) {
        return Arrays.stream(numList)
                .boxed()
                .sorted((a, b) -> Math.abs(a - n) == Math.abs(b - n) ? b.compareTo(a) : Integer.compare(Math.abs(a - n), Math.abs(b - n)))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
//class Solution {
//    public ArrayList<Integer> solution(int[] numlist, int n) {
////        int[] answer = {};
////        System.out.println(Arrays.toString(numlist));
//        Map<Integer,Integer> list = new HashMap<>();
//        for (int i = 0; i < numlist.length; i++){
//            int dif = Math.abs(numlist[i] - n);
//            list.put(numlist[i],dif);
//        }
//
//
//        // 최송 반환값
//        ArrayList<Integer> answer = new ArrayList<>();
//
//        for (int i = 0; i < numlist.length; i++) {
//            System.out.println(list);
//            // Value 값의 최소값의 key 리스트
//            List<Integer> keyWithMinValue = list.entrySet().stream()
//                            .filter(entry -> entry.getValue().equals(Collections.min(list.values())))
//                            .map(Map.Entry::getKey)
//                            .collect(Collectors.toList());
//            System.out.printf("keyWithMinValue= ");
//            System.out.println(keyWithMinValue);
//
//
//            if (keyWithMinValue.size() > 1) {
//                // value 최소값이 1개 이상 있을때
//                Optional<Integer> keyMax = keyWithMinValue.stream().max(Integer::compareTo);
//                answer.add(keyMax.get());
////                System.out.println("keyMax = " + keyMax.get());
//                list.remove(keyMax.get());
//
//            } else if (keyWithMinValue.size() == 1) {
//                answer.add(keyWithMinValue.get(0));
////                System.out.println("keyWithMinValue.get(0) = " + keyWithMinValue.get(0));
//                list.remove(keyWithMinValue.get(0));
//
//            }
//        }
//
//        return answer;
//    }
//}