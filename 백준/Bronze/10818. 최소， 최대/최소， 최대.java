//10818. 최소,최대
// N->테이블 개수 최소.최대(조건문 사용). min.max 활용
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //테이블 개수 입력. 최대.최소 정의
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = -1000000;
        int min = 1000000;

        //n만큼 입력. 최대 최소 구하기
        for(int i = 0; i < n; i++){
            int number = sc.nextInt();
            if(number > max){
                max = number;
            }

            if(number < min){
                min = number;
            }
        }

        //최소.최대 출력
        System.out.println(min + " " + max);

        sc.close();
    }
}
