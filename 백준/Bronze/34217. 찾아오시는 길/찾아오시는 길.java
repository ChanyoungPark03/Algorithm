// 34217. 찾아오시는 길
// (A,C).(B,D) 입력
// if-else문 조건 1-1. (A + C) < (B + D) / 조건 1.2 (A + C) > (B + D) / 조건 1-3. 같을때
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // (A,C).(B,D) 입력
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        
        // 두 가지 길 초기화
        int hanyang = A + C;
        int yongdap = B + D;
        
        // if-else문
        // 조건 1-1
        if(hanyang < yongdap){
            System.out.println("Hanyang Univ.");
        }
        
        // 조건 1-2
        else if(hanyang > yongdap){
            System.out.println("Yongdap");
        }
        
        // 조건 1-3
        else{
            System.out.println("Either");
        }

        sc.close();
    }
}
