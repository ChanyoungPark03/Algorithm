// 34052. 체육은 수학과목입니다 2
// 1~4 바퀴 입력 - 조건 1-1. (1~4바퀴 + 300) <= 1800 / 조건 1-2. (1~4바퀴) + 300 > 1800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // t1~t4 (1~4 바퀴) 입력 
        Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int t3 = sc.nextInt();
        int t4 = sc.nextInt();
        
        // 결과 = (t1~t4) + 300(t5 가정)
        int result = (t1 + t2 + t3 + t4) + 300;
        
        // 조건 1-1
        if(result <= 1800){
            System.out.println("Yes");
        }
        
        // 조건 1-2
        else{
            System.out.println("No");
        }

        sc.close();
    }
}
