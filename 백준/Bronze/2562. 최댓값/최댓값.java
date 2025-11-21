// 2562. 최댓값
// 배열(크기 9) 생성. 반복문->입력
// 최댓값. 몇 번째 수 찾기(count 변수)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // 배열 생성. count, max 변수 생성
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[9];
        int count = 1;
        int max = 0;

        // for문 -> 숫자 입력
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        // for문 -> 최댓값 초기화
        for(int i= 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // for문-> 몇 번째 수인지 count 초기화
        for(int i = 0; i < arr.length; i++){
            if(max != arr[i]){
                count++;
            }
            
            // 최댓값이면 종료(break)
            else{
                break;
            }
        }

            //결과 출력
            System.out.println(max);
            System.out.println(count);


        sc.close();
        }
    }
