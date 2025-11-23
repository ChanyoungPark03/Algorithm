// 1085. 직사각형에서 탈출
// (x,y),(w,h) 입력
// 직사각형 4가지 경우(위.아래.왼.오)-> if 조건문
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // x좌표(한수)
        int y = sc.nextInt(); // y좌표(한수)
        int w = sc.nextInt(); // 직사각형 x 좌표
        int h = sc.nextInt(); // 직사각형 y 좌표

        // 최소 범위 가장 크게 설정
        int min = 1000;

        // 경우의 수 4가지(위.아래.왼.오)
        if(min > (w-x)){
            min = w - x; // 오른쪽 길이
        }

        if(min > (h-y)){
            min = h - y; // 위쪽 길이
        }

        if(min > x){
            min = x; //왼쪽 길이
        }

        if(min > y){
            min = y; //아래쪽 길이
        }

        // 최솟값 출력
        System.out.println(min);

        sc.close();
    }
}
