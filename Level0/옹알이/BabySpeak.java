package Level0.옹알이;
/*
* 머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다.
* 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을 최대 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다.
* 문자열 배열 babbling이 매개변수로 주어질 때,
* 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.
* */

public class BabySpeak {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo","yemawooaya"};
        System.out.println(s.solution(babbling));

    }
}


class Solution {
    public int solution(String[] babbling) {
        int answer = 0;


//        ArrayList<String> words = new ArrayList<>(Arrays.asList("aya", "ye", "woo", "ma"));
        String[] words = {"aya", "ye", "woo", "ma"};

        for (String str : babbling) {

            for (String word : words) {
                // 하나씩
                if (str.equals(word)) {
                    answer++;
                }
            }
            for (String word1 : words) {
                // 2개씩
                for (String word2 : words) {
                    String newWord = word1 + word2;
                    if (str.equals(newWord)) {
                        answer++;
                    }
                }

            }
            for (String word1 : words) {
                // 3개씩
                for (String word2 : words) {
                    for (String word3 : words) {
                        String newWord = word1 + word2 + word3;
                        if (str.equals(newWord)) {
                            answer++;
                        }
                    }

                }
            }
            for (String word1 : words) {
                // 3개씩
                for (String word2 : words) {
                    for (String word3 : words) {
                        for (String word4 : words) {
                            String newWord = word1 + word2 + word3 + word4;
                            if (str.equals(newWord)) {
                                answer++;
                            }
                        }
                    }

                }
            }

        }


        return answer;
    }
}
