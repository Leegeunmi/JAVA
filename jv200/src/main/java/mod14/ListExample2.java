package mod14;

import java.util.*;

public class ListExample2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("second");
		list.add(0, new String("hello"));
		list.add("new String('hello')");
//		String total = ((String)list.get(0).value());
		System.out.println(list);
		
		for(String s : list){
			System.out.println(s);
		}
		
		
//		for(int i = 0; i < list.size(); i++) {
//			list.get(i);
//		}
		
		
//		public void deleteAll(Collection<NameList>c) {			
//			for(NameList nl : c) {
//				nl.deleteItem();
//			}
//		}		
	}
}
