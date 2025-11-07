//10871. X보다 작은 수
package bronze5;
import java.util.Scanner;

public class Num10871{
    public static void main(String[] args){

        //n,x 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        //크기가 n인 정수형 배열 a 생성
        int a[] = new int[n];

        //for문(n만큼 반복.배열 저장)
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();

            //if문(x보다 작으면 출력.띄어쓰기)
            if(a[i] < x){
                System.out.print(a[i] + " ");
            }
        }

    }
}
