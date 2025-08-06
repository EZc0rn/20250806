package sec01.exam03;

public class A { // 가능 가능!!
	
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B { // 가능 가능!!
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C { // 불가능!!!!!!
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class D { // 이러면 가능
		void method() {
			new A().field1 = 10;
			new A().method1();
			
			field2 = 10;
			method2();
		}
	}

}
