// 10952. A+B-5
// A,B 생성 - while 반복문-> A와 B 0입력시 종료
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // sum 변수 생성
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        // while 반복문-> 무한 반복. A,B 생성 및 sum 초기화
        while(true) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            sum = A + B;

            // 조건-> A,B = 0 일때 종료(break)
            if(A == 0 && B == 0) {
                break;
            }

            // sum 출력
            System.out.println(sum);
        }

        sc.close();
    }
}
