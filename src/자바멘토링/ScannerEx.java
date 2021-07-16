package 자바멘토링;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("이름, 학과, 학번을 줄 단위로 분리하여 입력하세요.");
		
		String name = scanner.next();
		String major = scanner.next();
		int age = scanner.nextInt();
		
		System.out.println("이름은 "+name+", 학과는 "+major+", 나이는 "+age+"살 입니다.");
		scanner.close();
	}
}