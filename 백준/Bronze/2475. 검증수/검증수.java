//2475. 검증수
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        //고유번호 5자리 입력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        //고유번호의 제곱을 각각의 정수형 변수로 저장
        int na = a * a;
        int nb = b * b;
        int nc = c * c;
        int nd = d * d;
        int ne = e * e;

        //검증수 계산
        int number = (na + nb + nc + nd + ne) % 10;
        System.out.println(number);

        sc.close();
    }
}
