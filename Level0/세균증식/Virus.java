package Level0.세균증식;

// 어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
// 처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때
// t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.
public class Virus {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int n = 2;
        int n = 7;
//        int t = 10;
        int t = 15;
        System.out.println(s.solution(n,t));
    }
}
class Solution {
    public int solution(int n, int t) {
        int virus = n;
        for (int i = 0; i<t; i++){
            virus = virus * 2;
        }
        return virus;
    }
}