// 7891. Can you add this?
// T 입력 -> for문(num1 + num2)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // T 입력
        
        // for문-> x.y입력, answer 출력
        for(int i = 0; i < T; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            int answer = x + y;
            System.out.println(answer);
        }

        sc.close();
    }
}
