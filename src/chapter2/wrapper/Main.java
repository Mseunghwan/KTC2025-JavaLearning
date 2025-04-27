package chapter2.wrapper;

import chapter2.clazz.Person;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("a = " + a);

        Person personA = new Person("h", 3);
        System.out.println("person = " + personA);

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("arr = " + arr);

        // 래퍼클래스(기본형 변수를 감싸고 있는 클래스)
        // 참조형 변수 입니다
        Integer num = 100;
        System.out.println("num = " + num);
        // 이렇게 하면 래퍼클래스는 바로 값이 나옴
        // 래퍼클래스는 내부 처리가 되어있기에 참조형 변수라도 값인 숫자가 출력

        // Integer 래퍼클래스 기능 중 toString이 있다
        String numStr = num.toString();

        // 직접 만든 래퍼클래스
        CustomInteger myInteger = new CustomInteger(10);
        String myStrInteger = myInteger.toString();
        System.out.println("myStrInteger = " + myStrInteger);
    }
}
