// 24078. 余り (Remainder)
// x 입력 - answer = x % 21;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // x 입력

        int answer = x % 21; // x를 21로 나눈 나머지 값
        System.out.println(answer); // 결과 출력

        sc.close();
    }
}
