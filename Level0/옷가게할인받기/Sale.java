package Level0.옷가게할인받기;

public class Sale {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int price = 150000;
        int price = 580000;
        System.out.println(s.solution(price));
    }
}
class Solution {
    public int solution(int price) {
        int answer = 0;
        if(price > 500000){
            answer = (int) (price * (1 - 0.20));
        } else if(price > 300000){
            answer = (int) (price * (1 - 0.10));
        } else if(price > 100000){
            answer = (int) (price * (1 - 0.05));
        } else {
            answer = price;
        }

        return answer;
    }
}