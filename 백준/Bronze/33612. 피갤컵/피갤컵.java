// 33612. 피갤컵
// N 입력 - N이 증가할때 조건 1-1. (월 <= 5) 조건 1-2. (월 > 5), 년 + 1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N번째

        // 1회차 피갤컵(년,월)
        int year = 2024;
        int month = 8;

        for (int i = 1; i <= N-1; i++) {

            // 조건 1-1
            if (month > 5) {
                year++;
                month = (month - 12) + 7;
            }

            // 조건 1-2
            else{
                month += 7;
            }
        }

        // 피갤컵 일정 출력
        System.out.println(year + " " + month);

        sc.close();
    }
}
