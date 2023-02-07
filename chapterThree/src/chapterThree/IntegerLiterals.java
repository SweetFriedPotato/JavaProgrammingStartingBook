package chapterThree;

public class IntegerLiterals {

	public static void main(String[] args) {
		int num1 = 123;
		int num2 = 0123; //8진수
		int num3 = 0x123; //16진수 표현
		
		//무조건 10진수로 출력하도록 바꿈
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);

		System.out.println("11 + 22 + 33 =" + (11 + 22 + 33)/*리터럴들: 저장한 다음에 덧셈*/);
		System.out.println("011 + 022 + 033" + (011 + 022 + 033));//8진수, 16진수 연산 가능!
		System.out.println("0x11+ 0x22 + 0x33" + (0x11 + 0x22 + 0x33));
	}
}
