package COSPro1급Java모의고사.꽃피우기;

// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {
    public int solution(int[][] garden) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        int n = garden.length;
        int m = garden[0].length;
        while(checkAllOnes(garden) != true){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(garden[i][j] == 1){
                        if(i - 1 >= 0){
                            garden[i-1][j] = 1;
                        }else if(i + 1 < n){
                            garden[i+1][j] = 1;
                        }else if(j-1 >=0){
                            garden[i][j-1] = 1;
                        }else if(j+1 < m){
                            garden[i][j+1] = 1;
                        }
                    }
                }

            }
            answer++;
        }


        return answer;
    }
    // 모든 값이 1인지 확인하는 메소드
    boolean checkAllOnes(int[][] garden) {
        for (int[] row : garden) {
            for (int num : row) {
                if (num != 1) {
                    return false;
                }
            }
        }
        return true;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] garden1 = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int ret1 = sol.solution(garden1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int[][] garden2 = {{1, 1}, {1, 1}};
        int ret2 = sol.solution(garden2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

    }
}