// 15894. 수학은 체육과목입니다
// n(가장 아래 정사각형 개수) 입력
// n개 마다 둘레: (n * 4) 규칙
// int 형 범위는 21억까지 인데? -> 왜 10의 9제곱(10억) 범위까지 안되는 걸까? -> long 자료형 사용
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); // n 입력
        
        long w = (2 * n); // w(가로) 초기화
        long h = (2 * n); // h(세로) 초기화


        long circum = w + h ; // circum -> 가로+ 세로

        // 둘레 출력
        System.out.println(circum);

        sc.close();
    }
}
