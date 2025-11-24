// 32384. 사랑은 고려대입니다.
// N 입력 - for문 이용
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N 입력

        for(int i = 0 ; i < N; i++){
            System.out.print("LoveisKoreaUniversity "); // print.공백 활용
        }

        sc.close();
    }
}
