//1330. 두 수 비교하기
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //입력
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        //if-else 조건문
        if(A > B){
            System.out.println(">");
        }

        else if(A < B){
            System.out.println("<");
        }

        else{
            System.out.println("==");
        }

        sc.close();
    }
}
