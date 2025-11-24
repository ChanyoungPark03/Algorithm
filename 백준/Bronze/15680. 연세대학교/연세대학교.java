// 15680. 연세대학교
// N 입력 - 조건 1. N == 1일 경우 / 조건 2. N == 0 일 경우
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N 입력

        // 조건 1. (N == 1)
        if(N == 0){
            System.out.println("YONSEI");
        }

        // 조건 2. (N == 0)
        else if(N == 1){
            System.out.println("Leading the Way to the Future");
        }

        // 그 외일 경우
        else{
            System.out.println("오류입니다.");
        }

        sc.close();
    }
}
