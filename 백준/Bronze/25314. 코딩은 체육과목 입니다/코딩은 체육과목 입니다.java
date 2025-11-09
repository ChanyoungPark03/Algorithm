//25314. 코딩은 체육과목 입니다
//n바이트 입력 후 결과 출력 (4바이트 마다 long 추가)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = n / 4;

        for(int i = 0; i < count; i++){
            System.out.print("long"+ " ");
        }

        System.out.print("int");

        sc.close();
    }
}
