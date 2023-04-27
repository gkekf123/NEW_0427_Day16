package day16_0427_interface_.basic;

public interface Inter1 {

	// 자동 상수 public static final자동으로 붙어서 상수 취급
	int a = 10;

	// 메서드를 선언하면 자동으로 추상메서드가 된다.
	void method01() ;
	
	// 인터페이스에는 static, default메서드 선언이 가능
	public static void method03() {
		System.out.println("스테틱 메서드");
	}
	
	public default void method04() {
		System.out.println("디폴트 메서드");
	}
}
