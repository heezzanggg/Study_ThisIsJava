package ch08_Interface.sec12;

public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("버스달립니다.");
    }

    public void checkFare() {
        System.out.println("승차요금을 체크합니다.");
    }
}
