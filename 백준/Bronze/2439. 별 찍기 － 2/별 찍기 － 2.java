// 2439. 별 찍기-2
// N 입력 - 이중 for문(N 만큼)->공백+줄어드는 구조
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // N 입력
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 1. N번 반복
        for(int i = 0; i < N; i++){

            // 2. 공백(1씩 줄어드는 방식)
            for(int j = 0; j < N-i-1; j++){
                System.out.print(" ");
            }

            // 3. *(1씩 증가하는 방식)
            for(int k = 0; k < i+1; k++){
                System.out.print("*");
            }

            // 결과 출력
            System.out.println();

            sc.close();
        }
    }
}
