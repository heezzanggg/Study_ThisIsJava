package ch08_Interface.sec11.exam02;

public class DriverExample {
    public static void main(String[] args) {
        // Driver 객체 생성
        Driver driver = new Driver();

        // Vehicle 구현 객체 생성
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        // 매개값으로 구현 객체 대입(다형성:실행 결과가 다름)
        driver.driver(bus); // 자동타입변환 -> 오버라이딩메소드호출 -> 다형성
        driver.driver(taxi); // 자동타입변환 -> 오버라이딩메소드호출 -> 디형성
    }
}
