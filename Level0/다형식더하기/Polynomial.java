package Level0.다형식더하기;

import java.util.ArrayList;
import java.util.Arrays;

public class Polynomial {
    public static void main(String[] args) {
        Solution s = new Solution();
//        String polynomial = "3x + 7 + x";
        String polynomial = "x + x + x";
        System.out.println(s.solution(polynomial));
    }
}
class Solution {
    public String solution(String polynomial) {
        String answer = "";

        String newPolynomial = polynomial.replaceAll(" ","");
        System.out.println(newPolynomial);

        int sum = 0;
        for (int i = 0; i < newPolynomial.length(); i++) {
            if (newPolynomial.charAt(0) == 'x') {
                sum += 1;
                System.out.println("if : " + sum);
            } else if (newPolynomial.charAt(i) == 'x') {
                if (newPolynomial.charAt(i - 1) == '+') {
                    sum += 1;
                    System.out.println("else-if : i = " +i + "sum" + sum);
                } else if (newPolynomial.charAt(i - 1) != '+') {
                    int num = Integer.parseInt(String.valueOf(newPolynomial.charAt(i - 1)));
                    sum += num;
                }
            }
        }
        System.out.println(sum); // x앞의 수

        String[] str = polynomial.split(" ");
        System.out.println(Arrays.toString(str));

        int sumStr = 0;
        for (int i = 0; i < str.length; i++){
            if (str[i].indexOf('x') >= 0 || str[i].indexOf('+') >= 0){
                continue;
            }else {
                sumStr += Integer.parseInt(str[i]);
            }
        }

        if (sumStr != 0){
            String newSumStr = Integer.toString(sumStr);
            answer = Integer.toString(sum) + 'x' +'+'+ newSumStr;
        }else if(sum > 1) {
            answer = Integer.toString(sum) + 'x';
        } else if (sum == 1) {
            answer = "x";
        }


        return answer;
    }
}