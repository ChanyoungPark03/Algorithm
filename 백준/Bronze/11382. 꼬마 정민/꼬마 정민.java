//11382. 꼬마 정민
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // 조건: 첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 10의 12승)
        // 입력 (long으로 받으면 sc,nextLong(); 으로 호출)

        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        //출력
        System.out.println(A+B+C);

        sc.close();
    }
}
