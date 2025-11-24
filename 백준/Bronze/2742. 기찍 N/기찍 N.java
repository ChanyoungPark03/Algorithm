// 2742. 기찍 N
// N 입력 - 반복문(줄어드는 구조)
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N 입력

        // 핵심 - for문 이렇게 쓸 수도 있음.
        for(int i = N, j = 0; j < N; i--, j++){
            System.out.println(i);
        }
    }
}
