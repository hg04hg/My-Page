package week3day03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student implements Comparable<Student>{
	String name;
	int kor;
	int eng;
	int tot;
	double ave;
	
	public Student() {} 
	public Student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.tot = this.kor + this.eng;
		this.ave = this.tot/2.0;
	}
	
	@Override
	public String toString() {
		return name + "   " + kor + "   " + eng + "   " + tot + "   " + ave;
	}
	
	@Override
	public int compareTo(Student o) {
		return this.tot - o.tot;
	}

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		
		// 3명 학생정보
		
		Student s1= new Student("김학생", 75, 100);
		list.add(s1);
		Student s2= new Student("이학생", 97, 85);
		list.add(s2);
		Student s3= new Student("박학생", 85, 80);
		list.add(s3);
		
		Collections.sort(list);  // 정렬
		
		System.out.println("<< 기본정렬: 총점 오름차순 >>");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 지역 내부 클래스
		class ComparatorImp implements Comparator<Student>{
			
			@Override
			public int compare(Student o1, Student o2) {
				return o1.kor - o2.kor;
			}
		}
		// 객체를 새로운 정렬기준으로 정렬
		Collections.sort(list, new ComparatorImp());
		System.out.println("<< 새로운 정렬기준으로 정렬: 국어성적 오름차순 >>");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 지역내부 익명클래스
		Collections.sort(list, new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				return o1.kor - o2.kor;
			}
		}  );
	}
}




















