// 34297. Parking Pandemonium
// M: 한 바퀴 시간, K: 온도, C: 주자창 도는 횟수 - 주차 자리 시간: M * C
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt(); // 한 바퀴 시간 입력
        int K = sc.nextInt(); // 온도 입력
        int C = sc.nextInt(); // 주차장 도는 횟수 입력

        // 주차 자리 시간 초기화 및 출력
        int T = M * C; 
        System.out.println(T); 

        sc.close();
    }
}
