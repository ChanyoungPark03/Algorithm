// 34411. M-Climb
// m,n,y 입력 - 비용 - (m * n)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // m,n,y 입력
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // m-> 바위 개수
        int n = sc.nextInt(); // n -> 페인트 비용
        int y = sc.nextInt(); // y -> 년도

        // 총 비용
        int price = m * n;
        System.out.println(price);

        sc.close();
    }
}
