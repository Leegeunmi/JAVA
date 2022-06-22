package mod14;

import java.util.*;

public class ListExample {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("one");
		list.add("second");
		list.add("3rd");
		list.add("new Integer(4)");
		list.add("new Float(5.0F)");
		list.add("second");			//duplicate, not added
		list.add("new Integer(4)");	//duplicate, not added
		System.out.println(list);

		
//--Generic Collection API
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(0, new Integer(42));
//		int total = ((Integer)list.get(0).intValue());
	}
}

//https://github.com/qja7767/JavaStudy
// 1 3 6 5 1 2 4 1 6 [0]
