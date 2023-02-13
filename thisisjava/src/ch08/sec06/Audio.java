package ch08.sec06;


public class Audio implements RemoteControl {
    //필드
    private int volume;

    //인터페이스의 추상메소드 오버라이딩
    @Override
    public void turnOn(){
        System.out.println("Audio 켬");
    }
    @Override
    public void turnOff(){
        System.out.println("Audio 끔");
    }
    @Override
    public void setVolume(int volume){
        if(volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        }else if(volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨"+volume);
    }

    //추가필드 선언
    private int memoryVolume;

    //디폴트메소드 재정의
    @Override
    public void setMute(boolean mute){
        if(mute){
            this.memoryVolume = this.volume;
            System.out.println("무음처리");
            setVolume(RemoteControl.MIN_VOLUME);
        }else {
            System.out.println("무음해제");
            setVolume(this.memoryVolume);

        }
    }

}
