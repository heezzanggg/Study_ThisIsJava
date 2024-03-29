package ch09_NestedClassAndAnonymousObject.sec04_localClass.exam02;

public class A {

    // 메소드
    void useB() {

        // 메소드 안의 로컬 클래스 B
        class B {
            // 인스턴스 필드
            int field1 = 1;

            // 정적 필드(Java 17~)
            static int field2 = 2;

            // 생성자
            B() {
                System.out.println("B-생성자 실행");
            }

            // 인스턴스 메소드
            void method1() {
                System.out.println("B-method1 실행");
            }

            // 정적 메소드(Java 17~)
            static void method2() {
                System.out.println("B-method2 실행");
            }
        }

        // 로컬 객체 생성
        B b = new B();

        // 로컬 객체의 이스턴스 필드와 메소드 사용
        System.out.println(b.field1);
        b.method1();

        // 로컬 클래스의 정적 필드와 메소드 사용(Java17~)
        System.out.println(B.field2);
        B.method2();
    }
}
