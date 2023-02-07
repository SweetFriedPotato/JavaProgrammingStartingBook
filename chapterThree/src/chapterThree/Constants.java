package chapterThree;

public class Constants {

	//상수: 값이 확정되어 다시 변할 수 없는 것, final로 정의
	public static void main(String[] args) {
		final int MAX_SIZE = 100;
		final char CONST_CHAR = '상';
		final int CONST_ASSIGNED;
		CONST_ASSIGNED = 12; //상수 선언만 하고 값 할당 안 했을 때 한 번은 할당 가능.
		System.out.println("상수1 : " + MAX_SIZE);
		System.out.println("상수2 : " + CONST_CHAR);
		System.out.println("상수3 : " + CONST_ASSIGNED);
	}
}
