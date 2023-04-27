package day16_0427_interface_.Quiz;

public class MainClass {

	public static void main(String[] args) {

		IBag a = new Array();
		a.insert("가방");
		a.insert("신발");
		a.insert("모자");
		a.print();
		System.out.println("인덱스 위치 : " + a.search("신발"));
		a.delete("가방");
		a.delete("신발");
	}

}
