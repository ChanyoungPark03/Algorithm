// 10810. 공 넣기
// 배열 생성 - for문(바구니 값 갱신) 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 케이스(M) 입력 및 바구니(arr[N]) 배열 생성
        int N = sc.nextInt(); 
        int M = sc.nextInt(); 
        int arr[] = new int[N];
        
        for(int a = 0; a < M; a++){
            
            // i번 ~ j 번 바구니. 값(k) 입력
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            // 핵심-바구니 값 갱신(증가)
            for(int b = 0; b <= j-i; b++) {
                arr[i-1+b] = k;
            }
        }

        // 결과 출력
        for(int c = 0; c < N; c++){
            System.out.print(arr[c] + " ");
        }

        sc.close();
    }
}
