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
		
		// 3�� �л�����
		
		Student s1= new Student("���л�", 75, 100);
		list.add(s1);
		Student s2= new Student("���л�", 97, 85);
		list.add(s2);
		Student s3= new Student("���л�", 85, 80);
		list.add(s3);
		
		Collections.sort(list);  // ����
		
		System.out.println("<< �⺻����: ���� �������� >>");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// ���� ���� Ŭ����
		class ComparatorImp implements Comparator<Student>{
			
			@Override
			public int compare(Student o1, Student o2) {
				return o1.kor - o2.kor;
			}
		}
		// ��ü�� ���ο� ���ı������� ����
		Collections.sort(list, new ComparatorImp());
		System.out.println("<< ���ο� ���ı������� ����: ����� �������� >>");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// �������� �͸�Ŭ����
		Collections.sort(list, new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				return o1.kor - o2.kor;
			}
		}  );
	}
}




















