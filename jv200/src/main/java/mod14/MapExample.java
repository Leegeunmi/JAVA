package mod14;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
//		map.put(new Integer(1), "����"); �´� �������� ���� �ڹٿ����� �Ʒ� ������ ���Ѵ�.
		map.put(Integer.valueOf(1), "����"); //1)
		map.put(2, "����"); //boxing unboxing //2)
		map.put(3, "���");
		
//		System.out.println(map.get(new Integer(1)));
		System.out.println(map.get(1));
		
		Set<Integer> set = map.keySet();
		for(Integer integer : set) {
			System.out.print(integer); //Ű�� ���
			System.out.println(" = " + map.get(integer)); //�� ���
		}
	}
}
