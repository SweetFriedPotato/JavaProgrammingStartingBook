package chapterTwo;

public class CharTypeUnicode {

	public static void main(String[] args) {
		char ch1 = '헐';
		char ch2 = '확';
		char ch3 = 54736; //유니코드
		char ch4 = 54869;
		char ch5 = 0xD5D0;
		char ch6 = 0xD655;
		System.out.println(ch1 + " " + ch2); //공백 추가해야 안 더해지고 원래 값 나옴
		System.out.println(ch3 + " " + ch4);
		System.out.println(ch5 + " " + ch6);
		

	}

}
