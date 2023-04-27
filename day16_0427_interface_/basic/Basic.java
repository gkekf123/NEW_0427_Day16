package day16_0427_interface_.basic;

	//인터페이스를 상속 받을 때는 implements 키워드를 사용
	//인터페이스는 다중 상속이 가능하다
public class Basic implements Inter1, Inter2{

	//인터페이스에 있는 추상메서드는 반드시 오버라이딩 되야 한다
	public void method01() {
		System.out.println("제정의 된 1번 메서드 사용");
	}
	
	//인터페이스에 있는 추상메서드는 반드시 오버라이딩 되야 한다
	public void method02() {
		System.out.println("재정의 된 2번 메서드 사용");
	}
	
	// 일반 메서드 선언
	public void method03()	 {
		System.out.println("나의 3번 메서드 사용");
	}
	
}
