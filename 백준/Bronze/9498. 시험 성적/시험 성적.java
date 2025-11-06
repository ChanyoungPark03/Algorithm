//9498. 시험 성적
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //점수 입력
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        //if-else문(점수별 등급 출력) (&& ->그리고)
        if(score >=90 && score <=100){
            System.out.println("A");
        }

        else if(score >=80 && score <=89){
            System.out.println("B");
        }

        else if(score >=70 && score <=79){
            System.out.println("C");
        }

        else if(score >=60 && score <=69){
            System.out.println("D");
        }

        else{
            System.out.println("F");
        }
        
        sc.close();
    }
}
