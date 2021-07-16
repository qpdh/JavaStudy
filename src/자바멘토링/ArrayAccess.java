package 자바멘토링;

public class ArrayAccess {

	public static void main(String[] args) {

		int Array[][][] = { { { 1, 2, 3 }, { 4, 5, 6 } }, { { 7, 8, 9 }, { 10, 11, 12 } } };


		for (int i = 0; i < Array.length; i++) {
			for (int j = 0; j < Array[0].length; j++) {
				for(int k= 0;k<Array[0][0].length;k++) {
					System.out.print(Array[i][j][k]+"\t");
				}
				System.out.println();
			}
		}

	}

}
