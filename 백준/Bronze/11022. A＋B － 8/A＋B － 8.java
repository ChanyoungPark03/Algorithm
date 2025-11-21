//11022. A+B-8
// 1. T(테이블) 입력 -> T만큼 반복문
// 2. 반복문-> 두 정수 입력 후 산술연산
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //T와 sum 변수 생성
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int sum = 0;

        //반복문-> T만큼 반복. A,B 변수 생성
        for(int i = 1; i < T + 1; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            sum = A + B;

            //결과 출력
            System.out.println("Case #" + i + ": "
            + A + " + " + B + " = " + sum);

        }


    }
}
