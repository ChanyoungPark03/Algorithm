//10871. X보다 작은 수
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //정수 N, X 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 정수 N(수열 개수)
        int x = sc.nextInt();

        //for문-a의 인덱스값 10개 받기
        for(int i = 0; i < n; i++){
            int a[] = new int[10001]; //크기가 10인 정수형 배열 A 생성
            a[i] = sc.nextInt(); //인덱스값 입력

            if(x <= 1 && a[i] > x){
                break;
            }

            //if 조건문-x보다 작은 값 출력
            if(a[i] < x){
                System.out.print(a[i] + " ");
            }
        }

        sc.close();
    }
}
