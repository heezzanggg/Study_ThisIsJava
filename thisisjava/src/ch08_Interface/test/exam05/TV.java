package ch08_Interface.test.exam05;

public class TV implements Remocon {
    @Override
    public void powerOn() {
        System.out.println("TV를 켰습니다.");
    }

    public static void main(String[] args) {
        Remocon r = new TV();
        r.powerOn();

        // TV tv = new TV();
        // tv.powerOn();
    }
}
