package day16_0427_interface_.basic3;

public class LG implements printed{

	private String Logo = "Life is good";
	
	@Override
	public void print(String document) {
		System.out.println(Logo);
		System.out.println(document);
	}

	@Override
	public void colorPrint(String document, String color) {
		System.out.println(Logo);
		System.out.println("color : " + color);
		System.out.println(color + "색상 : " + document);
	}

	@Override
	public int copy(int n) {
		for(int i = 0; i < n; i++) {
			System.out.println(i + "장 복사중");
		}
		return 1;
	}

}
