// 34691. 대전과학고등학교를 사랑하십니까?
// 문자열 입력 - 문자열 비교(.equlas) - end 있을때 종료(break)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 무한루프
        while(true){
            String answer = sc.next();

            // 문자열 비교(.equals)
            if(answer.equals("animal")){
                System.out.println("Panthera tigris");
            }

            if(answer.equals("flower")){
                System.out.println("Forsythia koreana");
            }

            if(answer.equals("tree")){
                System.out.println("Pinus densiflora");
            }

            if(answer.equals("end")){
                break; // 조건 1. end 있을때 종료
            }
        }

        sc.close();
    }
}
