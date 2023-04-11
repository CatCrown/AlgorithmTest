package Day1.A.연속된수의합;

/*
* 연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다.
* 두 정수 num과 total이 주어집니다. 연속된 수 num개를 더한 값이 total이 될 때,
* 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.
* */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NUM {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int num = 3;
//        int num = 5;
        int num = 5;

//        int total = 12;;
//        int total = 15;
        int total = 5;

        System.out.println(Arrays.toString(s.solution(num,total)));
// Arrays.toString() 주소값으로 반환하지 않고 배열로 반환하게 함
    }
}


class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int center = total / num;
        int number = total % num == 0 ? num / 2 : num / 2 - 1;

        int startNumber = center - number;

        for (int i = 0; i < num; i++) {
            answer[i]= startNumber + i;
        }
        return answer;
    }
}

