package chapterThree;

public class EscapeSequences {

	public static void main(String[] args) {
		System.out.println("AB" + '\b' + "C"); // '\b = backspace
		System.out.println("AB" + '\t' + "C"); // '\t = tab
		System.out.println("AB" + '\n' + "C"); // '\n = line change
		System.out.println("AB" + '\r' + "C"); // '\r = carriage return(커서를 왼쪽 끝으로 이동)
	}
}
