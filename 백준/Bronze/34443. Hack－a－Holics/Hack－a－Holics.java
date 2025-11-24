// 34443. Hack-a-Holics
// n,c,p 입력 - m = n * p
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 해커톤 개수 입력
        int c = sc.nextInt(); // 비용 입력
        int p = sc.nextInt(); // 금전적 가치 입력
        
        //총 금전적 가치 초기화 및 출력
        int m = n * p;
        System.out.println(m);

        sc.close();
    }
}
