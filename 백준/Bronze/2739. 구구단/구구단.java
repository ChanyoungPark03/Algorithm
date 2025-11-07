//2739. 구구단
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //단 입력
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        //구구단 출력
        for(int i = 1; i <= 9; i++){
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
