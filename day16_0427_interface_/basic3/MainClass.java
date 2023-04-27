package day16_0427_interface_.basic3;

public class MainClass {

	public static void main(String[] args) {

		// interface로 선언 후 사용하고 싶은 클래스 사용
		printed p = new Samsung(); //new LG();
		
		p.print("Hello WOrld");
		p.colorPrint("Hello World02", "파란색");
		int result = p.copy(5);
		
		// MainClass -> printed(매개체) -> LG
		
	}

}
