package week2day05;

public abstract class ��� {
	String name;
	int age;
	
	public ���() {
		
	}
	
	public ���(String name, int age) {	//�θ��� �ٸ� �����ڸ� ȣ���Ϸ��� super ���
		this.name = name;
		this.age = age;
	}
	
	public void �ܴ�() {
		System.out.println("�ܴ�");
	}
	
	public void �Դ´�() {
		System.out.println("�Դ´�");
	}
	
	public abstract void �����();    //�Լ���  ����κи� ������ �ż��带 �߻�ż���� �Ѵ�.
	
}
