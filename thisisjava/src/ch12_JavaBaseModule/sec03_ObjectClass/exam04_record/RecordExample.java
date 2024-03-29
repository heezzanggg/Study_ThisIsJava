package ch12_JavaBaseModule.sec03_ObjectClass.exam04_record;

public class RecordExample {
  public static void main(String[] args) {
    Member m = new Member("winter", "눈송이", 25);

    // getter메소드 호출
    System.out.println(m.id());
    System.out.println(m.name());
    System.out.println(m.age());

    System.out.println(m.toString()); // Member[id=winter, name=눈송이, age=25]
    System.out.println("==================");

    Member m1 = new Member("winter", "눈송이", 25);
    Member m2 = new Member("winter", "눈송이", 25);

    System.out.println("m1.hashCode():" + m1.hashCode());
    System.out.println("m2.hashCode():" + m2.hashCode());
    System.out.println("m1.equals(m2): " + m1.equals(m2)); // 동등비교

  }

}
