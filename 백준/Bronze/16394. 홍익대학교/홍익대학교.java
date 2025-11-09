//16394. 홍익대학교
// 몇주년 인지 출력하는 문자(연산자 활용)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //년 입력
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        //주년 출력
        int anniversary = year - 1946;
        System.out.println(anniversary);
    }
}
