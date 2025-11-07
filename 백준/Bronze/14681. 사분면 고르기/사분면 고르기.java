//14681. 사분면 고르기
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //x , y 입력
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        //if-else조건문(사분면에 따른 부등호 사용)
        if(x > 0 && y > 0){
            System.out.println("1");
        }
        else if(x < 0 && y > 0){
            System.out.println("2");
        }
        else if(x < 0 && y < 0){
            System.out.println("3");
        }
        else{
            System.out.println("4");
        }

        sc.close();
    }
}
