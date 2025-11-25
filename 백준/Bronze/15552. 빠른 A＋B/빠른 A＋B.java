// 15552. 빠른 A+B
// t 입력 - for문 (t만큼)
// BufferedReader. StringTokenizer 사용
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  // br 생성
        int t = Integer.parseInt(br.readLine()); // t 입력

        // sb 사용
        StringBuilder sb = new StringBuilder();
        
        // for문 (t 만큼)
        for(int i = 0 ; i < t; i++){

            // st - 한 줄을 " "(공백) 자르기
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken()); // a 입력
            int b = Integer.parseInt(st.nextToken()); // b 입력
            
            // sb 저장
            sb.append(a+b).append("\n");
        }
        
        // 결과 출력
        System.out.println(sb);

        br.close();
    }
}