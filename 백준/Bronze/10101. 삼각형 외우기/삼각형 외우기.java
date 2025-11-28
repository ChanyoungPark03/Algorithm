// 10101. 삼각형 외우기
// 세 각 입력
// 조건 1. 180일때. 아닐때  2. 180일때 (세각 같은 경우, 두각 같은 경우, 같은 각이 없는 경_
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 세 각 입력
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 각의 합 초기화
        int angle = a + b + c;

        // 조건 1-1. 세 각의 합이 180
        if (angle == 180) {

            // 조건 2-1. 세각 같은 경우
            if (a == b && b == c) {
                System.out.println("Equilateral");
            }

            // 조건 2-2. 두각 같은 경우
            else if (a == b || b == c || c == a) {
                System.out.println("Isosceles");
            }

            // 조건 2-3. 같은 각이 없는 경우
            else {
                System.out.println("Scalene");
            }
        }

        // 조건 1-2. 세 각의 합이 180 아닐대
        else {
            System.out.println("Error");
        }


        sc.close();
    }
}
