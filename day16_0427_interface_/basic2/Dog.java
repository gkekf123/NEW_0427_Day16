package day16_0427_interface_.basic2;

public class Dog extends Animal implements IPet{

	@Override
	public void eat() {
		System.out.println("갱얼쥐는 사료를 먹는다");
	}

	@Override
	public void play() {
		System.out.println("갱얼쥐는 나랑 논다");
	}

}
