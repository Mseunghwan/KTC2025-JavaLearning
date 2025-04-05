package chapter2.interfaceexample;

public class LuxuryCar implements Car {
    @Override
    public void drive() {
        System.out.println("멋지게 이동");
    }

    @Override
    public void stop() {
        System.out.println("멋지게 정지");
    }

    // 추가기능
    void charge(){
        System.out.println("차량을 충전합니다");
    }
//    void move(){
//        System.out.println("멋지게 이동");
//    }
//    void stop(){
//        System.out.println("멋지게 정지");
//    }
}
