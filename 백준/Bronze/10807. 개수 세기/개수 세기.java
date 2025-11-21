// 10807. 개수 세기
// N입력 - 반복문(N번 반복) 숫자 입력 - 배열 - 조건문(v일때 count 증가)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // N입력. 숫자 배열 생성. v가 몇개인지(count변수 생성)
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int number[] = new int[N];
        int count = 0;

        // for문->숫자 입력(배열-> 인덱스 저장)
        for(int i = 0; i < N; i++){
            number[i] = sc.nextInt();
        }

        // v 입력
        int v = sc.nextInt();

        // 핵심- v일때 count 증가
        for(int i = 0; i < N; i++)
        if(number[i] == v){
            count++;
        }

        // 결과 출력
        System.out.println(count);
    }
}
