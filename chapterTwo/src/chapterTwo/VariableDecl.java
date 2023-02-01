package chapterTwo;

public class VariableDecl {

	public static void main(String[] args) {
		double num1, num2; //2개의 변수 한번에 정의 가능
		double result;
		num1 = 1.0000001;
		num2 = 2.0000001;
		result = num1 + num2;
		System.out.println(result); //실수 표현에는 오차 항상 존재
	}

}
