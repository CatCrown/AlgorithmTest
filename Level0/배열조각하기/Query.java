package Level0.배열조각하기;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

// 정수 배열 arr와 query가 주어집니다.
//
//query를 순회하면서 다음 작업을 반복합니다.
//
//짝수 인덱스에서는 arr에서 query[i]번 인덱스를 제외하고 배열의 query[i]번 인덱스 뒷부분을 잘라서 버립니다.
//홀수 인덱스에서는 arr에서 query[i]번 인덱스는 제외하고 배열의 query[i]번 인덱스 앞부분을 잘라서 버립니다.
//위 작업을 마친 후 남은 arr의 부분 배열을 return 하는 solution 함수를 완성해 주세요.
public class Query {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {0, 1, 2, 3, 4,5};
        int[] query = {4, 1, 2};
        System.out.println(s.solution(arr,query));
    }
}



class Solution {
    public ArrayList<Integer> solution(int[] arr, int[] query) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }
        System.out.println(list);

        for (int i = 0; i < query.length; i++){
            if (i % 2 == 0){
                //  리스트에서 query[i]보다 큰 인덱스를 가지는 모든 값을 삭제
                    list = new ArrayList<>(list.stream()
                            .limit(query[i])  //  limit() 함수를 사용하여 지정된 개수만큼의 요소만 유지하고 나머지는 삭제
                            .collect(Collectors.toList())); // collect() 함수와 Collectors.toList()를 사용하여 Stream을 ArrayList로 변환

//                for (int j = list.size()-1; j > query[i] ; j--){
//                    list.remove(j);
//                    System.out.println("짝수 = " + list);
//                }
            } else {
                // 리스트에서 query[i]보다 작은 인덱스를 가지는 모든 값을 삭제
                list = new ArrayList<>(list.stream()
                        .skip(query[i])
                        .collect(Collectors.toList()));
//                for (int j = query[i]-1; j >= 0; j--){
//                    list.remove(j);
//                    System.out.println("홀수 = " + list);
//                }
            }
        }
        return list;
    }
}