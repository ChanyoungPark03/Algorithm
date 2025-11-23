// 2884. 알람시계
// H,M 입력
// 조건 1. M < 45 일때, H-1, M+45
// 조건 2. H == 0 , M < 45 일때, H == 23, M+45
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // H,M 입력. alarm 설정
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int alarm = 45;

        // 조건 1. (M < 45일때)
        if(M < 45){

            // 조건 1-1. (H==0 일때)
            if(H == 0){
                H = 23;
                M = M + 60 - alarm;
            }
            // 조건 1-2. (H != 0 일때)
            else {
                H = H - 1;
                M = M + 60 - alarm;
            }
        }


        // 조건 2. (M >= 45일때)
        else{
            M = M - alarm;
        }

        // alarm 출력
        System.out.println(H + " " + M);

        sc.close();
    }
}