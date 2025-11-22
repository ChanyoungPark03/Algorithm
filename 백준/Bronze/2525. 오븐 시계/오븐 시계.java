// 2525. 오븐 시계
// 시,분 입력 - 분 추가 - 시 : 23->0 분: 59->0
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // H,M,plusM 입력
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int plusM = sc.nextInt();

        // timeM(더한 분 계산)
        int timeM = M + plusM;

        // 조건. 60분이 넘어갈때
        if(timeM >= 60){

            H = H + (timeM / 60);
            M = timeM % 60;

            // 조건. 24시가 넘어갈때
            if(H >= 24){
                H = (H - 24) ;
            }

            System.out.println(H + " " + M);
        }

        // 조건. 시가 안넘어갈때
        else{
            System.out.println(H + " " + timeM);
        }

        sc.close();
    }
}
