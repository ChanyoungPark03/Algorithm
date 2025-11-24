// 4101. 크냐?
// while문(무한루프) -> num1,num2 대소비교 - if문-> num1,num2 =0일때 종료
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 무한 루프
        while(true){

            // 숫자 생성
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            // 조건 2. num1,num2 ==0 일때 종료
            if(num1 == 0 && num2 == 0) {
                break;
            }
            
            // 조건 1. num1,num2 대소비교
            if(num1 > num2){
                System.out.println("Yes");
            }

            else{
                System.out.println("No");
            }
        }
        
        sc.close();
    }
}
