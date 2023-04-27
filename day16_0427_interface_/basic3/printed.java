package day16_0427_interface_.basic3;

public interface printed {
	
	// 클래스가 구현해야 할 프린트의 기능들..
	void print(String document);	//프린트
	void colorPrint(String document, String color);	// 컬러프린ㄷ트
	int copy(int n);	//복사 장수받아서 복사하는 기능

}