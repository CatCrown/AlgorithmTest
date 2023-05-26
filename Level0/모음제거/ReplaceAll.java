package Level0.모음제거;

public class ReplaceAll {
    public static void main(String[] args) {
        Solution s = new Solution();
        String my_string = "bus";
        System.out.println(s.solution(my_string));
    }
}

class Solution {
    public String solution(String myString) {
        return myString.replaceAll("a|e|i|o|u", "");
    }
}
//class Solution {
//    public String solution(String my_string) {
//        String answer = "";
//        String[] str = {"a", "e", "i","o", "u"};
//        for (String s : str){
//            if(my_string.indexOf(s) >= 0){
//                System.out.println(my_string.indexOf(s));
//                my_string = my_string.replaceAll(s,"");
//            }
//        }
//        return my_string;
//    }
//}