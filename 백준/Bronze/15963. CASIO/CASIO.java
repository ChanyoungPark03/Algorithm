// 15963. CASIO
// N,M 입력 - 조건 1-1. (N == M) / 조건 1-2. (N != M)
// 범위: 10자리 정수 (long 자료형)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // long 자료형 N,M 입력
        long N = sc.nextLong();
        long M = sc.nextLong();
        
        // 조건 1-1
        if(N == M){
            System.out.println("1");
        }
        
        // 조건 1-2
        else{
            System.out.println("0");
        }

        sc.close();
    }
}
