// 2744. 대소문자 바꾸기
// 문자열 입력 - charAt. toUppercase(), toLowercase() 사용
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        // 문자열 입력
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // for문(문자열 길이 반복)
        for(int i = 0; i < s.length(); i++){

            // 문자 저장하기
            char c = s.charAt(i);

            // 조건 1. 대문자일 경우
            if(Character.isUpperCase(c)){
                char result = Character.toLowerCase(c);
                System.out.print(result);
            }

            // 조건 2. 소문자일 경우
            if(Character.isLowerCase(c)){
                char result = Character.toUpperCase(c);
                System.out.print(result);
            }

            sc.close();
        }
    }

}
