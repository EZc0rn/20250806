package nested; // 패키지 선언: nested 패키지에 속한 클래스들

public class A {
    class B {}
    
    static class C {}
    
    void method() {
        class D {
        	int field1;
        	static int field2;
        }
        D d1 = new D();
        d1.field1 = 700;
        D.field2 = 100;
    }

    public static void main(String[] ar) {
        // 인스턴스 멤버 클래스 B의 객체 생성 방법:
        // A 클래스의 인스턴스를 먼저 생성한 후, 그 인스턴스를 통해 B의 인스턴스를 생성해야 함
    	
        // A a1 = new A();         // A 클래스의 인스턴스 생성
        // B b1 = a1.new B();      // B 클래스의 인스턴스 생성 (a1을 통해)
        
        B b1 = new A().new B();     // 위 두 줄을 한 줄로 작성 (익명 A 인스턴스를 통해 B 생성)

        A.C c1 = new A.C();         // 정적 클래스 C는 A의 인스턴스 없이 바로 생성 가능
    }
}
