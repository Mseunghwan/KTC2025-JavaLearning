package chapter2.interfaceexample;

public class Main {
    public static void main(String[] args) {
        // 인스턴스화
        LuxuryCar luxuryCar = new LuxuryCar();
        SpeedCar speedCar = new SpeedCar();

        // 활용
        luxuryCar.drive();
        luxuryCar.stop();
        speedCar.drive();
        speedCar.stop();

        // 고유한 기능
        luxuryCar.charge();
        speedCar.autoParking();
    }
}
