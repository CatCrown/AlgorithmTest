package Level0.아이스아메리카노;

import java.util.ArrayList;

public class IceAmericano {
    public static void main(String[] args) {
        Solution s = new Solution();
        int money = 5500;
        System.out.println(s.solution(money));
    }


}
class Solution {
    public int[] solution(int money) {
        return new int[] { money / 5500, money % 5500 };
    }
}
//class Solution {
//    public ArrayList<Integer> solution(int money) {
//            ArrayList<Integer> answer = new ArrayList<>();
//            int cup = money / 5500;
//            int cash = money % 5500;
//            answer.add(cup);
//            answer.add(cash);
//
//        return answer;
//    }
//}