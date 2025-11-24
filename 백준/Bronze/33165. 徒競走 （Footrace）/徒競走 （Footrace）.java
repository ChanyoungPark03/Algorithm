// 33165. 徒競走 (Footrace)
// t,v 입력 - d = t * v
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 시간 출력
        int v = sc.nextInt(); // 초당 거리 출력

        int d = t * v; // 총 거리 출력
        System.out.println(d);

        sc.close();
    }
}
