package chap11.exam01;

import java.util.HashMap;

public class KeyEx2 {

	public static void main(String[] args) { // 키값 주면 value를 주는 구조
		HashMap<Member, String> hashMap = new HashMap<Member, String>();
		hashMap.put(new Member("blue"), "홍길동");
		
		String value = hashMap.get(new Member("blue"));
		System.out.println(value);

	}

}
