package mod14;

import java.util.*;

public class SetExample {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("one");
		set.add("second");
		set.add("3rd");
		set.add("new Integer(4)");
		set.add("new Float(5.0F)");
		set.add("second");			//duplicate, not added
		set.add("new Integer(4)");	//duplicate, not added
		System.out.println(set);
	}
}

//> DB는 중복을 하려고 하지 않는다.  중복데이터를 없애기 위해 설정한다.
//> pk를 기준으로 중복확인
//> 들어가기전에 중복검사 / 들어가고나서 기존 데이터와 비교하여 중복검사 __ 캐바캐