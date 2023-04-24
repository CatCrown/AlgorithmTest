package Level0.배열만들기2;

import java.util.ArrayList;

// 정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
//
//만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
public class MakeList2 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int l = 5;
//        int l = 10;
        int r = 555;
//        int r = 20;
        System.out.println(s.solution(l,r));
    }
}
class Solution {
    public ArrayList<Integer> solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            String str = Integer.toString(i);
            if (str.indexOf("1") >= 0 || str.indexOf("2") >= 0|| str.indexOf("3") >= 0 || str.indexOf("4") >= 0 ||
                    str.indexOf("6") >= 0 || str.indexOf("7") >= 0 || str.indexOf("8") >= 0|| str.indexOf("9") >= 0){
                continue;
            }
            answer.add(i);
        }
        if (answer.isEmpty()){
            answer.add(-1);
        }
        return answer;
    }
}