package ch07_2_polymorphism;

public class CarExampleTest {
	public static void main(String[] args) {
		CarTest myCar = new CarTest("����",3000);
		myCar.run();
		CarTest subCar = new CarTest("�׷���", 1600, "����", "�ƹݶ�");
		subCar.run();
	}
}
