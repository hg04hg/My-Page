package week3day03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest { 
// 순서 상관없을 때 , 중복된 데이터 허용 하고 싶지 않을 떄 => Set 사용

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("one"); // 데이터 저장(추가)
		set.add("two");
		set.add("three");
		set.add("one");
		set.add("two");
		set.add("4");
		set.add("5");
		set.add("six");
		System.out.println("저장된 데이터 수 : " + set.size()); // 데이터 수 출력

		Iterator<String> it = set.iterator(); // Iterator(반복자) 생성

		while (it.hasNext()) { // 데이터가 있으면 true, 없으면 false를 반환
			System.out.println(it.next()); // next() : 다음 데이터 리턴
		}
		System.out.println("-----------------------------------");
		set.remove("three"); // 데이터 제거

		System.out.println("저장된 데이터 수 : " + set.size()); // 데이터 수 출력
		it = set.iterator(); // 반복자 재생성( 위에 반복문에서 next 매서드로 데이터를
									   // 다 가져왔기 때문에 재생성을 해야함

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
