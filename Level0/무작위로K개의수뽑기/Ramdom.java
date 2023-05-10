package Level0.무작위로K개의수뽑기;

import java.util.Arrays;
import java.util.stream.IntStream;

// 랜덤으로 서로 다른 k개의 수를 저장한 배열을 만드려고 합니다.
// 적절한 방법이 떠오르지 않기 때문에 일정한 범위 내에서 무작위로 수를 뽑은 후,
// 지금까지 나온적이 없는 수이면 배열 맨 뒤에 추가하는 방식으로 만들기로 합니다.
//
//이미 어떤 수가 무작위로 주어질지 알고 있다고 가정하고, 실제 만들어질 길이 k의 배열을 예상해봅시다.
//
//정수 배열 arr가 주어집니다. 문제에서의 무작위의 수는 arr에 저장된 순서대로 주어질 예정이라고 했을 때,
// 완성될 배열을 return 하는 solution 함수를 완성해 주세요.
//
//단, 완성될 배열의 길이가 k보다 작으면 나머지 값을 전부 -1로 채워서 return 합니다.
public class Ramdom {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int[] arr = {0, 1, 1, 2, 2, 3};
//        int[] arr = {0, 1, 1, 1, 1};
        int[] arr = {1,2,1};
//        int k = 3;
//        int k = 4;
        int k = 3;
        System.out.println(Arrays.toString(s.solution(arr,k)));
    }
}

class Solution {
    public int[] solution(int[] arr, int k) {
        return IntStream.concat(Arrays.stream(arr).distinct(), IntStream.range(0, k).map(i -> -1)).limit(k).toArray();
    }
}
//class Solution {
//    public int[] solution(int[] arr, int k) {
//        int[] answer = new int[k];
//        int count = 0;
//        HashSet<Integer> set = new HashSet<>();
//        for (int i = 0; i < arr.length; i++){
//            if (set.size() < k) {
//                set.add(arr[i]);
//            }else {
//                break;
//            }
//        }
//        for (Integer num : set){
//            answer[count++] = num;
//            System.out.println("answer : " + Arrays.toString(answer));
//        }
//        while (count < k){
//            answer[count++] = -1;
//            System.out.println("count < k : " + Arrays.toString(answer));
//        }
//        return answer;
//    }
//}