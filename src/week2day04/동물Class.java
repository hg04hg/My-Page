package week2day04;

class ���� {
	String �̸�;
	int ����;

	public void ¢�´�() {
		System.out.println("������ ¢�´�.");
	}

	public void �ܴ�() {
		System.out.println("������ �ܴ�.");
	}
}

class ������ extends ���� {   // extends : Class ���
	@Override 	  
	public void ¢�´�() {
		System.out.println("�۸�");
	}

	public void �ܴ�() {
		System.out.println("������ �ܴ�.");
	}

	public void ������Ų��() {
		System.out.println("���� ��Ų��.");
	}
}

class ����� extends ���� {
	@Override 			// �θ��� ����� �������ؼ� ���, �������̵�
	public void ¢�´�() {
		System.out.println("�߿�");
	}

	public void �ܴ�() {
		System.out.println("������ �ܴ�.");
	}

	public void �㸦���() {
		System.out.println("�㸦 ��´�.");
	}

}


