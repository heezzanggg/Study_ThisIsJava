package ch08_Interface.sec04;

public class Television implements RemoteControl {
    // 필드
    private int volume;

    // 인터페이스의 추상메소드 오버라이딩
    @Override
    public void turnOn() {
        System.out.println("TV 켬");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 끔");
    }

    @Override
    public void setVolume(int volume) {
        // 인터페이스의 상수필드 바로 사용 가능(인터페이스명.상수명)
        if (volume > RemoteControl.MAX_VOLUME) {
            System.out.println("RemoteControl.MAX_VOLUME");
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            System.out.println("RemoteControl.MIN_VOLUME");
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            System.out.println("volume");
            this.volume = volume;
        }
        System.out.println(volume);
        System.out.println(this.volume);
        System.out.println("현재 TV 볼륨" + this.volume);
    }
}
