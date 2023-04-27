package day16_0427_interface_.Quiz;

public class Array implements IBag{
	
	//클래스에는 크기가 100인 String[]을 선언해주세요.
	private String[] str = new String[100];
	private int idx;
	
	//저장 - 매개변수를 배열에 순서대로 저장
	@Override
	public void insert(String item) {
		str[idx] = item;
		idx++;
	}

	//출력 - 배열안에 개수만큼 출력
	@Override
	public void print() {
		for(int j = 0; j < idx; j++) {
			System.out.println("가방 : " + str[j]);
		}
	}

	//검색 - 값이 있다면 index를 return, 없다면 -1을 리턴(가장먼저 검색된 item순서 반환)
	@Override
	public int search(String item) {
		for(int  i = 0; i < idx; i++) {
			if(str[i].equals(item)) {
				return i;
			} 
		}
		
		return -1;
	}

	//삭제 - 배열의 요소를 삭제(가장먼저 찾게된 item하나만 삭제)
	@Override
	public boolean delete(String item) {
		if(item == null) return false;
		String [] del = new String[str.length -1];
		
		for(int i = 0; i < idx; i++) {
			// 찾은경우의 조건
			if(str[i].equals(item)) {
				// 뒤의 아이템을 당기고 종료
				for(int j = i; j < idx -1; j++) {
					str[j] = str[j + 1];	// 앞으로 당긴다
				}
				str[idx-1] = null;
				idx--;
				return true;
			}
		}
		return false;
		
		
	}

	
}
