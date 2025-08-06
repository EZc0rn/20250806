package chap11.exam01;

import java.util.HashMap;

public class KeyEx {

	public static void main(String[] args) { // 키값 주면 value를 주는 구조
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		hashMap.put(new Key(1), "홍길동");
		
		String value = hashMap.get(new Key(1));
		System.out.println(value);

	}

}
