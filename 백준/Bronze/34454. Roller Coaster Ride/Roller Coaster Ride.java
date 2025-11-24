// 34454. Roller Coaster Ride
// N,C,P 입력 - 조건 1-1. N <= C*P / 조건 1-2. N > C*P
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // N,C,P 입력
        int N = sc.nextInt();
        int C = sc.nextInt();
        int P = sc.nextInt();

        // 조건 1-1
        if(N <= C * P){
            System.out.println("yes");
        }

        // 조건 1-2
        else{
            System.out.println("no");
        }

        sc.close();
    }
}
