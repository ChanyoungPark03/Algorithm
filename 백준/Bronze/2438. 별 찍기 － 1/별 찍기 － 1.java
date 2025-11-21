//2438. 별찍기-1
// N 입력. 2중 반복문 -> N만큼(순차적 증가)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // N입력
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 2중 반복문(N만큼 반복, 순차적 증가(반복))
        for(int i = 0; i < N; i++){
            System.out.print("*");
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
