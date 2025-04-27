package chapter1.variable;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a =  1;
        boolean booleanBox = false;
        System.out.println("booleanBox = " + booleanBox);
        // System도 객체

        // 다운 캐스팅
        double bigBox = 10.123;
        int smallBox = (int)bigBox;
        // --> 소수점 자리가 잘려나감

        // 업 캐스팅
        int smallBox2 = 10;
        double bigBox2 = (int)smallBox2;
        // --> 데이터 손실 없음

        // 문자열 데이터
        char a1 = 'a';
        String str = "안녕하세요!";

        // 정수형
        int a2 = 1;
        long a3 = 1;

        // 논리형
        boolean b1 = true;

        // 입력(Scanner)
        Scanner scanner = new Scanner(System.in);

        System.out.print("좋아하는 문장을 입력 : ");
        String sentence = scanner.nextLine();
        System.out.println("sentence = " + sentence);


        System.out.print("좋아하는 숫자를 입력 : ");
        int intbox = scanner.nextInt();
        System.out.println("sentence = " + intbox);


    }
}
