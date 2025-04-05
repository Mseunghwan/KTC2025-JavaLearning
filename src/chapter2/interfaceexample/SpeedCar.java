package chapter2.interfaceexample;

public class SpeedCar implements Car{
    @Override
    public void drive() {
        System.out.println("빠르게 주행");
    }

    @Override
    public void stop() {
        System.out.println("빠르게 정지");
    }

    // 추가기능
    void autoParking(){
        System.out.println("자동 주차 기능");
    }
//    void drive(){
//        System.out.println("빠르게 주행");
//    }
}
