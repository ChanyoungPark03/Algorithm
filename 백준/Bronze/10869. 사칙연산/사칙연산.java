//10869. 사칙연산
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //입력
        Scanner sc = new Scanner(System.in);

        //입력받아 정수 자료형 A,B 초기화
        int A = sc.nextInt();
        int B = sc.nextInt();

        //출력
        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.println(A%B);
    }
}
