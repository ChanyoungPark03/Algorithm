//2588. 곱셈
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        //생각(나눠서 수를 계산하기 %/ 사용)
        int hunB = B / 100; //백의자리 수
        int tenB = (B % 100) / 10; //십의자리 수
        int oneB = (B % 100) % 10; //일의자리 수

        System.out.println(A*oneB);
        System.out.println(A*tenB);
        System.out.println(A*hunB);
        System.out.println(A*B);

    }
}
