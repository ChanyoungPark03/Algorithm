// 10951. A+B -4
// while 반복문(무한루프) - 조건 1.예외처리(EOF) - a,b 입력 및 sum 출력
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // while문(무한루프.예외처리)
        while(sc.hasNextInt()){
            
            int a = sc.nextInt(); // a 입력
            int b = sc.nextInt(); // b 입력

            int sum = a + b; // sum 초기화
            System.out.println(sum); // 결과 출력
        }
    }
}



