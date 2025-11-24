// 34281. Class Photo
// w: 가로 학생수, l: 세로 학생수 입력 - 전체 학생수: w * l
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt(); // 가로 학생수
        int l = sc.nextInt(); // 세로 학생수

        int student = w * l; // 전체 학생수
        System.out.println(student);

        sc.close();
    }
}
