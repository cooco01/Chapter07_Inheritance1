package ch07_2_polymorphism;

public class Bus extends Vehicle{
	@Override
	public void run() {
		System.out.println("택시가 달립니다");
	}
}
