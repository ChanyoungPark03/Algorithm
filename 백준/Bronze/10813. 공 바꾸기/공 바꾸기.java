// 10813. 공 바꾸기
// 배열(바구니) 생성 - for문(바구니 설정. 바구니 바꿔치기(temp))
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 바구니 개수 입력
        int M = sc.nextInt(); // 공 횟수 입력
        int basket[] = new int[101]; // 배열(바구니) 생성

        // 바구니 설정
        for (int i = 0; i < N; i++) {
            basket[i] = i + 1;
        }

        for(int j = 0; j < M; j++){
                int first = sc.nextInt(); // 첫번째 바구니
                int second = sc.nextInt(); // 두번째 바구니

                // 핵심- 바구니 값 바꿔치기(temp 변수 생성)
                int realFirst = first -1;
                int realSecond = second -1;

                int temp = basket[realFirst];
                basket[realFirst] = basket[realSecond];
                basket[realSecond] = temp;

            }

            // 배열 결과 출력
            for(int k = 0; k < N; k++){
                System.out.print(basket[k] + " ");
            }


            sc.close();
        }
    }
