package ch08_Interface.test.exam06.ex01;

public class SoundableExample {
  public static void printSound(Soundable soundable) {
    System.out.println(soundable.sound());
  }

  public static void main(String[] args) {
    printSound(new Cat());
    printSound(new Dog());
  }

}
