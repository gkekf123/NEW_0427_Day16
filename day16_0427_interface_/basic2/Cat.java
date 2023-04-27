package day16_0427_interface_.basic2;

public class Cat extends Animal implements IPet{

	@Override
	public void eat() {
		System.out.println("고양이는 생선을 먹는다");
	}

	@Override
	public void play() {
		System.out.println("고양이는 박스에 들어간다");
	}

}
