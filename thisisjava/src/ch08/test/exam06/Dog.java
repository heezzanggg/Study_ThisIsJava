package ch08.test.exam06;

public class Dog implements Soundable{
    //추상메소드 오버라이딩
    @Override
    public String sound(){
        return "멍멍";
    }
}
