package �ڹٸ��丵;

public class MyFirstClass {
	

	public static void main(String[] args) {
		Circle a = new Circle();
		a.printCircle();
		
		Circle2 b = new Circle2();
		b.printCircle();
	}

}

class Circle {
	public void printCircle() {
		System.out.println("Circle �Լ��Դϴ�.");
	}
}

class Circle2 extends Circle{
	public void printCircle() {
		System.out.println("Circle2 �Լ��Դϴ�.");
	}
}