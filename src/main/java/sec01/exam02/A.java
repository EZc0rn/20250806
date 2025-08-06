package sec01.exam02;

public class A {
	
	class B {}
	static class C {}
	
	B field1 = new B();
	C field2 = new C();
	
	static B field3 = new B(); // 
	static C field4 = new C();
	
	static B field5 = new A().new B(); // A가 먼저 선언되고 B가 선언되어야 한다.
	
	void method1() {
		B v1 = new B();
		C v2 = new C();
	}

	static void method2() { // static은 메모리에 그냥 불려져야 하는데 안되서 A를 먼저 선언해줌
		B v1 = new A().new B();
		C v2 = new C();
	}
}
