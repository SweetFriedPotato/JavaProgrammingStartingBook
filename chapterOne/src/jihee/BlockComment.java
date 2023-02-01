package jihee;


/* 
 *파일이름: Blockcomment.java
 *작성자: 최지희
 *작성일: 2023년 2월 1일
 *목적: System.out.println 메소드의 기능 테스트
 */
// 행 단위 주석 처리는 이렇게도 가능

public class BlockComment {
	public static void main(String[]args){
		/*다음은 단순한 정수의 출력*/
		//indent 고려하여 작성하기
		System.out.println(7);
		
		System.out.println(3.15);
		System.out.println("3 + 5 = " + 8);
		System.out.println(3.15 + "는 실수입니다");
		System.out.println("3 + 5" + "의 연산 결과는 8입니다");
		
		/*다음은 덧셈 결과의 출력*/
		System.out.println(3+5);
	}
}
