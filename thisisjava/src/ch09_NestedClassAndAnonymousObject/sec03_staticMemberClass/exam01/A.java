package ch09_NestedClassAndAnonymousObject.sec03_staticMemberClass.exam01;

//정적 멤버 클래스
public class A {
    // 정적 멤버 클래스
    static class B {
    }

    // 인스턴스 필드값으로 B객체 대입
    B field1 = new B();

    // 정적필드 값으로 B객체 대입
    static B field2 = new B();

    // 생성자
    A() {
        B b = new B();
    }

    // 인스턴스 메소드
    void method1() {
        B b = new B();
    }

    // 정적메소드
    static void method2() {
        B b = new B();
    }

}
