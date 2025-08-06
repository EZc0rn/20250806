// 패키지 선언 (sec01.exam05이라는 패키지에 속함)
package sec01.exam05;

// 외부 클래스(Outter) 정의
public class Outter {
	String field = "Outter-field";  // Outter 클래스의 인스턴스 필드
	void method() {
		System.out.println("Outter-method");  // Outter 클래스의 인스턴스 메서드
	}

	// 내부 클래스(Nested 클래스). Outter 클래스 내부에 정의됨.
	class Nested {
		String field = "Nested-field";  // Nested 클래스의 인스턴스 필드 (Outter와 동일한 이름의 변수)
		
		void method() {
			System.out.println("Nested-method");  // Nested 클래스의 인스턴스 메서드 (Outter와 동일한 이름의 메서드)
		}
		
		void print() {
			// this.field는 Nested 클래스 자신의 field를 의미함
			System.out.println(this.field);    // "Nested-field" 출력
			this.method();                    // Nested 클래스의 method() 호출 -> "Nested-method" 출력
		}
	}
	
	// main 메서드: 프로그램 실행 시작점
	public static void main(String[] ar) {
		// 중첩 클래스 인스턴스를 생성하려면 먼저 외부 클래스의 인스턴스를 생성해야 함
		Outter.Nested nested = new Outter().new Nested();
		
		// print 메서드 호출 → Nested 클래스의 필드와 메서드를 사용
		nested.print();  
		
		// 결과:
		// Nested-field
		// Nested-method
	}
}
