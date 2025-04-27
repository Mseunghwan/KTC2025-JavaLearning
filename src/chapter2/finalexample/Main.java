package chapter2.finalexample;

public class Main {
    public static void main(String[] args) {

        // 상수 활용 방법
        System.out.println("상수 활용: " + Circle.PI);

        // 불변 객체 활용
        final Circle c1 = new Circle(2);
        // 참조 변경을 막지만 내부 상태 변경을 막지 않는다
        // c1 = new Circle(5); 이건 막는데
        c1.radius = 5;
        // 는 못막는다

        System.out.println("c1 = " + c1);

        // 불변 객체의 내부 상태가 변경이 필요한 경우
        Circle c2 = new Circle(10); // 생성자
        // c2의 radius를 변경하는 것 처럼 활용
        Circle c3 = c2.changeRadius(20); // 긴ㅇ을 활용


    }
}
