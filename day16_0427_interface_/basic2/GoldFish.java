package day16_0427_interface_.basic2;

public class GoldFish extends Fish implements IPet{

	@Override
	public void swim() {
		System.out.println("금붕어는 헤엄친다");
	}

	@Override
	public void play() {
		System.out.println("금붕어는 혼자 논다");
	}

	

	

}
