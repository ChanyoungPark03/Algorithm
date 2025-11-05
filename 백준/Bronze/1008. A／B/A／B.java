//1008. A/B
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();

        //double 로 형을 취해서 소수점까지 나오게 한다.
        double answer = A / B;
        System.out.println(answer);
    }
}
