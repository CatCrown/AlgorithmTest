package Level0.배열의원소삭제하기;


import java.util.*;
import java.util.stream.IntStream;

// 정수 배열 arr과 delete_list가 있습니다.
// arr의 원소 중 delete_list의 원소를 모두 삭제하고 남은 원소들은
// 기존의 arr에 있던 순서를 유지한 배열을 return 하는 solution 함수를 작성해 주세요.
public class DeleteList {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {293, 1000, 395, 678, 94};
        int[] delete_list = {94, 777, 104, 1000, 1, 12};
        System.out.println(s.solution(arr,delete_list));
    }
}
//class Solution {
//    public ArrayList<Integer> solution(int[] arr, int[] delete_list) {
//        int[] answer = {};
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            int count = 0;
//            for (int j = 0; j < delete_list.length; j++) {
//                if (arr[i] == delete_list[j]){
//                    count++;
//                }
//            }
//            if (count == 0){
//                list.add(arr[i]);
//            }
//        }
//        return list;
//    }
//}

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        return IntStream.of(arr).filter(i -> !IntStream.of(delete_list).anyMatch(s -> s == i)).toArray();
    }
}