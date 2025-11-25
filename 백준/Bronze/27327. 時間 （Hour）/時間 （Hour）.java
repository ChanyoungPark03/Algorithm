// 27327. 時間 (Hour) 
// x 입력 - h(시) : x * 24
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // 일 입력
        int h = x * 24; // 시간 초기화

        // 결과 출력
        System.out.println(h);

        sc.close();
    }
}
