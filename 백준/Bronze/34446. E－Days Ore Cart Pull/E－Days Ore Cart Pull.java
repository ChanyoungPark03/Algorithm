// 34446. E-Days Ore Cart Pull
// m-거리, n-학생 수, t-기온 생성 - 왕복 거리: 2 * m
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // 거리 입력
        int n = sc.nextInt(); // 학생 수 입력
        int t = sc.nextInt(); // 기온 입력

        int distance = 2 * m; // 왕복 거리: 2 * m
        System.out.println(distance);
        
        sc.close();
    }
}
