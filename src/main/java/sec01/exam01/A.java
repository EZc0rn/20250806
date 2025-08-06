package sec01.exam01; // 패키지 선언

public class A {
    // A 클래스의 생성자
    A() {
        System.out.println("A 생성자");
    }

    // 인스턴스 멤버 클래스 B (바깥 클래스 A의 인스턴스를 통해 접근 가능)
    class B {
        // B 클래스의 생성자
        B() {
            System.out.println("B 생성자");
        }

        int field;              // 인스턴스 필드
        static int field2;      // (Java 16 이전에는 불가능) 정적 필드는 내부 클래스에서 허용되지 않음 (오류 발생 가능)
        
        void method1() {}       // 인스턴스 메서드

        static void method2() { // (Java 16 이전에는 오류) 정적 메서드 - 내부 클래스에서는 원칙적으로 금지
            System.out.println("method2");
        }
    }

    public static void main(String[] ar) {
        // A 클래스의 인스턴스 생성 → A의 생성자 호출됨
        A a = new A(); // 출력: A 생성자

        // B 클래스의 인스턴스 생성 → A 인스턴스를 통해 생성해야 함
        A.B b = a.new B(); // 출력: B 생성자

        // B 클래스의 인스턴스 메서드 호출
        b.method1();

        // B 클래스의 static 메서드 호출 (※ Java 버전에 따라 오류 발생 가능)
        A.B.method2(); // 출력: method2
    }
}
