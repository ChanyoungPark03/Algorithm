//10950. A+B-3
//T를 입력-> T의 개수만큼 두개의 변수를 반복해서 입력 후 더해서 출력
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //T(table)를 입력
        Scanner sc = new Scanner(System.in);
        int table = sc.nextInt();

        //for문->A,B 반복해서 입력 후 출력
        for(int i = 0; i < table; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            //출력
            System.out.println(a + b);
        }

        sc.close();
    }
}
