package Level0.다형식더하기;

import java.util.ArrayList;
import java.util.Arrays;

public class Polynomial {
    public static void main(String[] args) {
        Solution s = new Solution();
//        String polynomial = "3x + 7 + x";
//        String polynomial = "x + x + x";
//        String polynomial = "x";
        String polynomial = "7 + 7";
        System.out.println(s.solution(polynomial));
    }
}
// 천재들의 풀이
class Solution {
    public String solution(String polynomial) {
        int xCount = 0;
        int num = 0;

        for (String s : polynomial.split(" ")) {
            if (s.contains("x")) {
                xCount += s.equals("x") ? 1 : Integer.parseInt(s.replaceAll("x", ""));
            } else if (!s.equals("+")) {
                num += Integer.parseInt(s);
            }
        }
        return (xCount != 0 ? xCount > 1 ? xCount + "x" : "x" : "") +
                (num != 0 ? (xCount != 0 ? " + " : "") + num : xCount == 0 ? "0" : "");
    }
}
//class Solution {
//    public String solution(String polynomial) {
//        String answer = "";
//
//        // 공백을 기준으로 나누기
//        String[] str = polynomial.split(" ");
//
//        int sumStr = 0; // x앞의 숫자 총합
//        int sumNum = 0; // 그냥 숫자의 총합
//        for (int i = 0; i < str.length; i++){
//            if (str[i].indexOf("x") < 0 && str[i].indexOf("+") < 0){
//                // x가 없을 경우, + 가 아닐 경우, 일반 숫자일 경우,
//                sumNum += Integer.parseInt(str[i]);
//            }else if (str[i].indexOf("x") >= 0){
//                // x앞에 숫자 총합 구하기
//                if (str[i].length() == 1){
//                    // str[i] = x일 경우,
//                    sumStr += 1;
//                } else {
//                    // str[i] = nx일 경우,
//                    sumStr += Integer.parseInt(str[i].substring(0,str[i].length()-1));
//                }
//            }
//        }
//
//        if (sumStr > 1 && sumNum != 0){
//            answer = Integer.toString(sumStr) + 'x'+ " " + '+' + " " + sumNum;
//        } else if (sumStr == 1 && sumNum != 0) {
//            answer = 'x'+ " " + '+' + " " + sumNum;
//        } else if (sumStr > 1 && sumNum == 0) {
//            answer = Integer.toString(sumStr) + 'x';
//        } else if (sumStr == 1 && sumNum == 0) {
//            answer = "x";
//        } else if (sumStr == 0 && sumNum != 0) {
//            answer = String.valueOf(sumNum);
//        }
//
//        return answer;
//    }
//}