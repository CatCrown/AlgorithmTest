package Level0.치킨쿠폰;

public class Chicken {
    public static void main(String[] args) {
        Solution s = new Solution();
        int chicken = 1081;
        System.out.println(s.solution(chicken));
    }

}
class Solution {
    public int solution(int chicken) {
        int coupen = 0;
        int service = 0;
        while (chicken >= 10) {
            coupen = chicken / 10;
            service += coupen;
            chicken = chicken % 10 + coupen;
        }
        return service;
    }
}