package ch08_Interface.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        // 인터페이스 변수 선언과 구현객체 대입
        Vehicle vehicle = new Bus();

        // 인터페이스를 통해서 호출
        vehicle.run();

        System.out.println("============");

        // 강제타입 변환 후 호출
        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();

        System.out.println("============");

        Bus b = new Bus();
        b.run();
        b.checkFare();
    }
}
