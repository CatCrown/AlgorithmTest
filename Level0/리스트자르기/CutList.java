package Level0.리스트자르기;

import java.util.ArrayList;

// 정수 n과 정수 3개가 담긴 리스트 slicer 그리고 정수 여러 개가 담긴 리스트 num_list가 주어집니다.
// slicer에 담긴 정수를 차례대로 a, b, c라고 할 때, n에 따라 다음과 같이 num_list를 슬라이싱 하려고 합니다.
//
//n = 1 : num_list의 0번 인덱스부터 b번 인덱스까지
//n = 2 : num_list의 a번 인덱스부터 마지막 인덱스까지
//n = 3 : num_list의 a번 인덱스부터 b번 인덱스까지
//n = 4 : num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로
//올바르게 슬라이싱한 리스트를 return하도록 solution 함수를 완성해주세요.
public class CutList {
    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 3;
        int[] slicer = {1,5,2};
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(s.solution(n,slicer,num_list));
    }
}
class Solution {
    public ArrayList<Integer> solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        ArrayList<Integer> answer = new ArrayList<>();
        switch (n){
            case 1:
                for (int i = 0; i <= b; i++){
                    answer.add(num_list[i]);
                }
                break;
            case 2:
                for (int i = a; i < num_list.length; i++){
                    answer.add(num_list[i]);
                }
                break;
            case 3:
                for (int i = a; i <= b; i++){
                    answer.add(num_list[i]);
                }
                break;
            case 4:
                for (int i = a; i <= b; i++){
                    answer.add(num_list[i]);
                    i++;
                }
                break;
        }
        return answer;
    }
}