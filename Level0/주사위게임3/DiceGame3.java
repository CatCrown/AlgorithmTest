package Level0.주사위게임3;

import java.util.*;

// 1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
//
//네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
//세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
//주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
//어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r이라면 q × r점을 얻습니다.
//네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
//네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때,
// 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
public class DiceGame3 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int a = 2;
        int b = 2;
        int c = 2;
        int d = 2;
//        int a = 4;
//        int b = 1;
//        int c = 4;
//        int d = 4;
//        int a = 6;
//        int b = 3;
//        int c = 3;
//        int d = 6;
//        int a = 2;
//        int b = 5;
//        int c = 2;
//        int d = 6;
//        int a = 6;
//        int b = 4;
//        int c = 2;
//        int d = 5;
        System.out.println(s.solution(a,b,c,d));
    }
}
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        Collections.sort(list);
        System.out.println(list);

        Set<Integer> set = new HashSet<>(Arrays.asList(a,b,c,d));
        switch (set.size()){
            case 1 :
                answer = 1111 * a;
//            System.out.printf("case1 , answer = %d%n", answer);
                break;
            case 2 :
                if (list.get(1) == list.get(2)) {// 같은 수 3개일때
                    int p = list.get(1);
                    int q = 0;
                    List<Integer> num = new ArrayList<>(set);
                    if (num.get(0) == p){
                        q = num.get(1);
                    }else {
                        q = num.get(0);
                    }
                    answer = (int) Math.pow(10 * p + q, 2);
//                    System.out.printf("case2 , answer = %d%n", answer);
                    break;
                } else if (list.get(1) != list.get(2)) {//  2개씩 같을 때
                    List<Integer> num = new ArrayList<>(set);
                    int p = num.get(0);
                    int q = num.get(1);
                    int abs = Math.abs(p-q); //절대치 구하기
                    answer = (p+q) * abs;
//                    System.out.printf("case2.2 , answer = %d%n", answer);
                    break;
                }
            case 3 :
                Set<Integer> SS = new HashSet<>();
                int p = 0;
                for (int i = 0; i < list.size(); i++) {
                    if (!SS.add(list.get(i))) {
                        p = list.get(i);
                    }
                }
                SS.remove(p);
//                System.out.println(SS);
                List<Integer> num = new ArrayList<>(SS);
                int r = num.get(0);
                int q = num.get(1);
                answer = r * q;
//                System.out.printf("case3 , answer = %d%n", answer);
                break;
            case 4 :
                answer = list.get(0);
//                System.out.printf("case4 , answer = %d%n", answer);
                break;
        }
        return answer;
    }
}