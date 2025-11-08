//8393. 합
//n을 입력->for문(1부터 n까지 합-sum변수)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //n 입력. sum(합) 변수 초기화
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        //for문-1부터 n까지 더하기
        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }

        //값 출력
        System.out.println(sum);

        sc.close();    
    }
}
