package 자바멘토링;

import java.util.Scanner;

public class MoneyOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int money = scanner.nextInt();

		int money_etc = money % 100;
		int money_100 = (money % 500) / 100;
		int money_500 = (money % 1000) / 500;
		int money_1000 = (money % 5000) / 1000;
		int money_5000 = (money % 10000) / 5000;
		int money_10000 = money / 10000;

		System.out.println("10,000원 권 : " + money_10000 + "장");
		System.out.println("5,000원 권 : " + money_5000 + "장");
		System.out.println("1,000원 권 : " + money_1000 + "장");
		System.out.println("500원 동전 : " + money_500 + "개");
		System.out.println("100원 동전 : " + money_100 + "개");
		System.out.println("기타 : " + money_etc + "원");

		scanner.close();
	}
}