package week1day05;

//����ȭ�� �����͸� ������ �� �ִ� �ڷ���, Ʋ  => ����� ���� �ڷ��� class
//���� ������ ,  public,  private
class HG {
	// private ���������ڸ� �̿��ؼ� ������ ���� �� ����
	private String name; // ��� ����
	private String job;
	private String birth;
	private int num;

	// �Լ� (�޼��� : �Լ��� Ŭ���� ���η� ���鼭 �� Ŭ������ ����ϴ� ����̴� ��� �ǹ̷� �ż��� ��� �θ�)
	public void setName(String name) {
		this.name = name;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public String getJob() {
		return job;
	}

	public String getBirth() {
		return birth;
	}

	public int getNum() {
		return num;
	}

}

public class class02 {

	public static void main(String[] args) {

		HG h = new HG(); // new ������ �̸�

		h.setName("���"); // .��� ���� ������
		h.setJob("Hanyang Technical High School");
		h.setNum(21211);
		h.setBirth("2004 06 16");

		System.out.println("�̸� : " + h.getName());
		System.out.println("�б� : " + h.getJob());
		System.out.println("��ȣ : " + h.getNum());
		System.out.println("������� : " + h.getBirth());

	}

}
