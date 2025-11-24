//2420. 사파리월드
// N,M 입력 - (|N-M|)-> Math.abs 사용 + long 자료형
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N,M 입력
        long N = sc.nextLong();
        long M = sc.nextLong();

        // long 자료형(|N-M|) -> Math.abs 사용
        long answer = Math.abs(N-M);

        // 정답 출력
        System.out.println(answer);
    }
}
