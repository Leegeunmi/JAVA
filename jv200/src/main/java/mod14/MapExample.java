package mod14;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
//		map.put(new Integer(1), "유비"); 맞는 것이지만 현재 자바에서는 아래 사용법을 권한다.
		map.put(Integer.valueOf(1), "유비"); //1)
		map.put(2, "관우"); //boxing unboxing //2)
		map.put(3, "장비");
		
//		System.out.println(map.get(new Integer(1)));
		System.out.println(map.get(1));
		
		Set<Integer> set = map.keySet();
		for(Integer integer : set) {
			System.out.print(integer); //키값 출력
			System.out.println(" = " + map.get(integer)); //값 출력
		}
	}
}
