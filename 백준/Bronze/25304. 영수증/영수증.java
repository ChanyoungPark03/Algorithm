//25304. 영수증
/* 구매한 물건 가격.개수 입력 + 물건 개수만큼 반복
   총 금액이랑 일치하는지 논리 연산자 사용
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //가격.개수 입력. sum 초기화
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int count = sc.nextInt();
        int sum = 0;

        //개수 만큼 반복. 각 물건의 가격.개수 입력
        for(int i = 0 ; i < count; i++){
            int thingPrice = sc.nextInt();
            int thingCount = sc.nextInt();

            //물건의 가격 더하기
            sum = sum + (thingPrice * thingCount);
        }

        //영수증 금액이 일치/불일치 출력
        if(price == sum){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        sc.close();
    }
}
