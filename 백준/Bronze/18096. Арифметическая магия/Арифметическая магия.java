// 18096. Арифметическая магия
// 결과: 무조건 1
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // n 입력

        // Math.pow(,) -> 제곱 함수 (1이 밑. n이 지수) . (int) 명시적 형변환
        int answer = (int) Math.pow(1,n);
        System.out.println(answer); // 결과 출력

        sc.close();
    }
}
