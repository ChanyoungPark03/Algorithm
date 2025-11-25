// 31606. 果物 (Fruit)
// x,y 입력 - count = x+y+3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // 사과 입력
        int y = sc.nextInt(); // 귤 입력

        int count = x + y + 3; // 사과 + 귤 + 바나나
        System.out.println(count); // 개수 출력

        sc.close();
    }
}
