package by.htp.hometask.array2d;

//14. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

//| 0  0  0  ... 0  0  1|
//| 0  0  0  ... 0  2  0|
//| 0  0  0  ... 3  0  0|
//| 0  0 n-2 ... 0  0  0| 
//| 0 n-1 0  ... 0  0  0|
//| n  0  0  ... 0  0  0|

public class Task14 {

	public static void main(String[] args) {

		int n;
		int m;

		n = 6;
		m = 6;

		int mas[][] = new int[n][m];

		int k;
		k = mas.length - 1;

		for (int i = 0; i < mas.length; i++) {

			mas[i][k] = i + 1;

			k--;
		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.print(mas[i][j] + " ");

			}

			System.out.println();
		}

	}

}
