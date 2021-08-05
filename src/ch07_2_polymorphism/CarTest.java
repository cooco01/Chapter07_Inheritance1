package ch07_2_polymorphism;

public class CarTest {

	// 필드
	String color;
	int engine;
	String company;
	String carname;
	
	// 생성자
	
	public CarTest(String color, int engine, String company, String carname) {
		System.out.println(color + "색" + engine + "cc 차가 달린다~~");
	}
	public CarTest(String color, int engine) {
		System.out.println(color + "색" + engine + "cc 차가 달린다~~");
	}

	// 메소드
	void run() {
	}
}
