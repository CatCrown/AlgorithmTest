package Level0.대소문자바꿔서출력하기;

// 영어 알파벳으로 이루어진 문자열 str이 주어집니다.
// 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
import java.util.Scanner;
public class ChangeWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (Character.isLowerCase(ch)){
                answer += Character.toUpperCase(ch);
            }else {
                answer += Character.toLowerCase(ch);
            }
        }
        System.out.println(answer);
    }
}
