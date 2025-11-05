//18108. 1998년생인 내가 태국에서는 2541년생?!
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        //입력과 정수형 자료 year 초기화
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        //불기 초기화
        int BuddhistEra = year - 543;
        
        //출력
        System.out.println(BuddhistEra);
    }
}
