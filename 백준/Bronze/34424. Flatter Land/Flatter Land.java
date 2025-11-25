// 34424. Flatter Land
// n,x 입력 - 거리: x * (n-1)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 인원 수 입력
        int x = sc.nextInt(); // 사람 간의 거리 입력
        
        int d = x * (n-1); // 총 거리 초기화
        System.out.println(d);

        sc.close();
    }
}
