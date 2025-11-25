// 33161. 鉛筆 2 (Pencils 2)
// a 입력 - p = a / 5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // a엔 입력
        int pencil = a / 5; // pencil 초기화

        System.out.println(pencil); // 결과 출력

        sc.close();
    }
}
