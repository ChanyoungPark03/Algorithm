// 27323. 직사각형
// 가로,세로 입력 - 직사각형 공식: (가로 * 세로) 출력
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // 입력. 넓이 초기화
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt(); // 가로
        int h = sc.nextInt(); // 세로
        int area = (w * h); // 넓이

        // 넓이 출력
        System.out.println(area);

        sc.close();
    }
}
