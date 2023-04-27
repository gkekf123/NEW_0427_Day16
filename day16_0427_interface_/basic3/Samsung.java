package day16_0427_interface_.basic3;

public class Samsung implements printed{

	@Override
	public void print(String document) {
		System.out.println("샘숭 : " + document);
	}

	@Override
	public void colorPrint(String document, String color) {
		System.out.println("샘숭 : " + color + ", " + document);
	}

	@Override
	public int copy(int n) {
		System.out.println("샘숭 : " + n + "장 복사");
		return n;
	}
	
}
