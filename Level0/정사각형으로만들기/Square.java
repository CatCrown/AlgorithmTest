package Level0.정사각형으로만들기;

import java.util.ArrayList;
import java.util.LinkedList;

public class Square {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] arr = {{572, 22, 37}, {287, 726, 38}, {85, 137, 292}, {487, 13, 876}};
        int[][] arr1 = {{57, 192, 534, 2},{9, 345, 192, 999}};
        int[][] arr2 = {{1, 2},{3, 4}};
        int[][] arr3 = {{1}};
        System.out.println(s.solution(arr));
        System.out.println(s.solution(arr1));
        System.out.println(s.solution(arr2));
        System.out.println(s.solution(arr3));
    }
}
class Solution {
    public ArrayList<LinkedList<Integer>> solution(int[][] arr) {
        ArrayList<LinkedList<Integer>> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            LinkedList<Integer> list = new LinkedList<>();
            for (int j = 0; j < arr[i].length; j++){
                list.add(arr[i][j]);
            }
            answer.add(list);
        }

        if(arr[0].length == arr.length){
            return answer;
        } else if(arr[0].length < arr.length) {
            for (int z = 0; z < arr.length; z++){
                answer.get(z).add(0);
            }
        } else if (arr[0].length > arr.length) {
            for (int z = arr.length; z < arr[0].length; z++){
                LinkedList<Integer> list = new LinkedList<>();
                for (int i = 0; i < arr[0].length; i++){
                    list.add(0);
                }
                answer.add(list);
            }

        }
        return answer;
    }
}