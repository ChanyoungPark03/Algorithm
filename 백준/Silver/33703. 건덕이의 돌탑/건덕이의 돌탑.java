// 33703. 건덕이의 돌탑
// 하노의 탑 변형 알고리즘
// 1부터 n까지의 합: (1+n) * (n / 2)
// long 자료형(범위 int 초과)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); // n 입력

        // 돌의 최소 이동 횟수
        long count = ((1 + n) * n) / 2;
        System.out.println(count);

        sc.close();
    }
}

