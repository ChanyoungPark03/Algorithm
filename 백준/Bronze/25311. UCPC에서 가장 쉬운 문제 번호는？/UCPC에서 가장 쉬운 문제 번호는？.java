// 25311. UCPC에서 가장 쉬운 문제 번호는?
// y 입력 - if-조건문
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt(); // y 입력

        // 2018<= y <= 2022
        if(y >= 2018 && y <= 2022){
            System.out.println("A");
        }

        sc.close();
    }
}
