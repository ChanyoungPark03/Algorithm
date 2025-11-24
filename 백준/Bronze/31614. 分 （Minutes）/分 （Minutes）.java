// 31614. 分 (Minutes)
// h,m 입력 - h = 60m
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(); // 시 입력
        int m = sc.nextInt(); // 분 입력

        // 총 분 입력 및 출력
        int t = (h * 60) + m;
        System.out.println(t);

        sc.close();
    }
}
