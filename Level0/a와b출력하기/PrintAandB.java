package Level0.a와b출력하기;


// 정수 a와 b가 주어집니다.
// 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.

import java.util.Scanner;
public class PrintAandB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String A = Integer.toString(a);
        String B = Integer.toString(b);

        System.out.printf("a = %s%nb = %s",A,B);
    }
}