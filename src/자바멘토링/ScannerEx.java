package �ڹٸ��丵;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("�̸�, �а�, �й��� �� ������ �и��Ͽ� �Է��ϼ���.");
		
		String name = scanner.next();
		String major = scanner.next();
		int age = scanner.nextInt();
		
		System.out.println("�̸��� "+name+", �а��� "+major+", ���̴� "+age+"�� �Դϴ�.");
		scanner.close();
	}
}