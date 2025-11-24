// 10872. 팩토리얼
// N 입력
// 팩토리얼 공식: 1) N! - ex) 3!-3*2*1 / 2) 0! == 1
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N 입력
        int answer = 1; // 조건 2. N이 0일때

        // 조건 1. N이 0이 아닐때
        if (N != 0){
            for (int i = 1; i <= N; i++) {
                answer *= i;
            }
    }
        
        //정답 출력
        System.out.println(answer);

        sc.close();
    }
}
