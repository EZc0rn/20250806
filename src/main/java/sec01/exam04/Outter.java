package sec01.exam04;

public class Outter {
	public void method1(int arg) { // final 성격을 갖고 있다.
		int var = 1; // 특성상 얘도 final 성격을 갖고 있다.
//		arg = arg + 200;
//		var = 2;
		class Inner {
			public void method() {
				int result = arg + 100;
			}
		}
	}
}
