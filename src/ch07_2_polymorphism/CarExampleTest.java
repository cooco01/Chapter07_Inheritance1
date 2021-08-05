package ch07_2_polymorphism;

public class CarExampleTest {
	public static void main(String[] args) {
		CarTest myCar = new CarTest("검정",3000);
		myCar.run();
		CarTest subCar = new CarTest("그레이", 1600, "현대", "아반떼");
		subCar.run();
	}
}
