//10430. 나머지
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //입력 후 정수형 변수 (A,B,C) 초기화
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        //값 출력하기
        System.out.println((A+B)%C);
        System.out.println(((A%C)+(B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C)*(B%C))%C);

        sc.close();
    }
}
