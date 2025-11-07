//2753. 윤년
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //year(연도) 입력
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        //if-else 조건문(윤년 -> &&(그리고), |(혹은) !=(아니다) 논리 연산자 사용
        if(year % 4 == 0 && (year % 100 != 0 | year % 400 == 0 )){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }

        sc.close();
    }
}
