package by.htp.hometask.array2d;

//21. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 

//| 6  0  0  ... 0  0  0|
//| 5  6  0  ... 0  0  0|
//| 4  5  6  ... 0  0  0|
//| 3  4  5  ... 6  0  0| 
//| 2  3  4  ... 5  6  0|
//| 1  2  3  ... 4  5  6|

public class Task21 {

	public static void main(String[] args) {

		int n;
		int m;
		int k;

		n = 6;
		m = 6;
		k = 0;

		int mas[][] = new int[n][m];

		for (int i = mas.length - 1; i >= 0; i--) {

			k++;

			for (int j = 0; j < mas.length; j++) {

				mas[i][j] = k;

				k++;

				if (k > mas.length) {

					k = 1;
				}
			}
		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = mas.length - 1; i < j; j--) {

				mas[i][j] = 0;

			}
		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas.length; j++) {

				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
	}
}
