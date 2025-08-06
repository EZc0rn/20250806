package chap11.exam01;

public class ObjectEx {

	public static void main(String[] args) {
		Object object1 = new Object();
		Object object2 = new Object();
		
		System.out.println(object1 == object2);
		System.out.println(object1.equals(object2));
		
		String str1 = new String("가나다");
		String str2 = new String("가나다");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

	}

}
