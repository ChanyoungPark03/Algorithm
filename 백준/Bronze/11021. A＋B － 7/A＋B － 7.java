//11021. A + B - 7
// A+B 입력 후 출력. T만큼 반복
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // t(테이블) 입력
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        // 테이블 만큼 반복. a+b 계산 후 출력
        for(int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Case #" + (i+1) + ": " + (a+b));
        }
    }
}