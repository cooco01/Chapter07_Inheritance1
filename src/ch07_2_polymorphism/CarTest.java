package ch07_2_polymorphism;

public class CarTest {

	// �ʵ�
	String color;
	int engine;
	String company;
	String carname;
	
	// ������
	
	public CarTest(String color, int engine, String company, String carname) {
		System.out.println(color + "��" + engine + "cc ���� �޸���~~");
	}
	public CarTest(String color, int engine) {
		System.out.println(color + "��" + engine + "cc ���� �޸���~~");
	}

	// �޼ҵ�
	void run() {
	}
}
