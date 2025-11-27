// 3003. 킹, 퀸, 룩, 비숍, 나이트, 폰
// 개수 입력 - if문(조건 1. 적을때 조건(+) 2. 많을 때(-) 3. 같을 떄(==)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 검정 피스
        int king = 1;
        int queen = 1;
        int look = 2;
        int bishop = 2;
        int knight = 2;
        int pawn = 8;

        // 흰색 피스 입력
        int cking = sc.nextInt();
        int cqueen = sc.nextInt();
        int clook = sc.nextInt();
        int cbishop = sc.nextInt();
        int cknight = sc.nextInt();
        int cpawn = sc.nextInt();

        // 조건 1. 2. 3
        if(cking > king){
            int mking = king - cking;
            System.out.print(mking + " ");
        }
        else if(cking == king){
            int eking = 0;
            System.out.print(eking + " ");
        }
        else{
            int pking = king - cking;
            System.out.print(pking + " ");
        }

        
        if(cqueen > queen){
            int mqueen = queen - cqueen;
            System.out.print(mqueen + " ");
        }
        else if(cqueen == queen){
            int equeen = 0;
            System.out.print(equeen + " ");
        }
        else{
            int pqueen = queen - cqueen;
            System.out.print(pqueen + " ");
        }

        
        if(clook > look){
            int mlook = look - clook;
            System.out.print(mlook + " ");
        }
        else if(clook == look){
            int elook = 0;
            System.out.print(elook + " ");
        }
        else{
            int plook = look - clook;
            System.out.print(plook + " ");
        }

        
        if(cbishop > bishop){
            int mbishop = bishop - cbishop;
            System.out.print(mbishop+ " ");
        }
        else if(cbishop == bishop){
            int ebishop = 0;
            System.out.print(ebishop + " ");
        }
        else{
            int pbishop = bishop - cbishop;
            System.out.print(pbishop + " ");
        }

        
        if(cknight > knight){
            int mknight = knight - cknight;
            System.out.print(mknight + " ");
        }
        else if(cknight == knight){
            int eknight = 0;
            System.out.print(eknight + " ");
        }
        else{
            int pknight = knight - cknight;
            System.out.print(pknight + " ");
        }

        
        if(cpawn > pawn){
            int mpawn = pawn - cpawn;
            System.out.print(mpawn);
        }
        else if(cpawn == pawn){
            int epawn = 0;
            System.out.print(epawn);
        }
        else{
            int ppawn = pawn - cpawn;
            System.out.print(ppawn);
        }

        sc.close();
    }
}
