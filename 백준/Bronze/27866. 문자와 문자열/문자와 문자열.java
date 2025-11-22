// 27866. 문자와 문자열
// 문자열 S 입력 - charAt 사용(i번째 출력)
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // S,i 입력
        String S = sc.next();
        int i = sc.nextInt();

        // charAt -> i번째 출력(인덱스)
        System.out.println(S.charAt(i-1));


        sc.close();
    }
}