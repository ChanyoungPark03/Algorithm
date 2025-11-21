//2480. 주사위 세개
//1. 주사위 3개 입력-> 조건문을 통해 상금 결정

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        //주사위 3개 입력
        Scanner sc = new Scanner(System.in);
        int Dice1 = sc.nextInt();
        int Dice2 = sc.nextInt();
        int Dice3 = sc.nextInt();

        // 각 조건에 맞는 money 변수 생성
        int moneyTriple = 0;
        int moneyDouble = 0;
        int moneyElse = 0;

        // 1번 조건 (같은 눈 3개 나올때)
        if(Dice1 == Dice2 && Dice2 == Dice3) {
            moneyTriple = 10000 + (Dice1 * 1000);
            System.out.println(moneyTriple);
        }

        // 2번 조건(같은 눈 2개 나올때)
        else if((Dice1 == Dice2) || (Dice2 == Dice3) || (Dice3 == Dice1)) {
            if (Dice1 == Dice2) {
                moneyDouble = 1000 + (Dice1 * 100);
                System.out.println(moneyDouble);

            } else if (Dice2 == Dice3) {
                moneyDouble = 1000 + (Dice2 * 100);
                System.out.println(moneyDouble);
            } else {
                moneyDouble = 1000 + (Dice3 * 100);
                System.out.println(moneyDouble);
            }
        }
        // 3번 조건(모두 다른 눈 나올때)
        else {
            if (Dice1 > Dice2 && Dice1 > Dice3) {
                moneyElse = Dice1 * 100;
                System.out.println(moneyElse);
            }
            if(Dice2 > Dice1 && Dice2 > Dice3){
                moneyElse = Dice2 * 100;
                System.out.println(moneyElse);
            }
            if(Dice3 > Dice1 && Dice3 > Dice2){
                moneyElse = Dice3 * 100;
                System.out.println(moneyElse);
            }
        }
    }
}