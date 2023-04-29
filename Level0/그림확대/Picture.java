package Level0.그림확대;

import java.util.*;

// 직사각형 형태의 그림 파일이 있고, 이 그림 파일은 1 × 1 크기의 정사각형 크기의 픽셀로 이루어져 있습니다.
// 이 그림 파일을 나타낸 문자열 배열 picture과 정수 k가 매개변수로 주어질 때,
// 이 그림 파일을 가로 세로로 k배 늘린 그림 파일을 나타내도록 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
public class Picture {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] picture = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
        int k = 2;
        System.out.println(s.solution(picture,k));
    }
}
class Solution {
    public ArrayList<String> solution(String[] picture, int k) {
        ArrayList<String> allList = new ArrayList<String>();
        for (int i = 0; i < picture.length; i++){
            String list = "";
            for (int j = 0; j < picture[i].length(); j++){
                char str = picture[i].charAt(j);
                for (int z = 0; z < k; z++){
                    list += str;
                }
            }
            for (int z = 0; z < k; z++){
                allList.add(list);
            }
        }
        return allList;
    }
}