package by.htp.hometask.array2d;

//13. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 

//   | 1  2   3  ... n|
//   | n n-1 n-2 ... 1|
//   | 1  2   3  ... n|
//   | n n-1 n-2 ... 1| 
//   | 1  2   3  ... n|
//   | n n-1 n-2 ... 1|

public class Task13 {

	public static void main(String[] args) {

		int n;
		int m;

		n = 6;
		m = 6;

		int mas[][] = new int[n][m];

		for (int i = 0; i < mas.length; i++) {

			if (i % 2 == 0) {

				for (int j = 0; j < mas.length; j++) {

					mas[i][j] = j + 1;
				}
			} else {

				for (int j = mas.length - 1; j >= 0; j--) {

					mas[i][j] = mas.length - j;
				}
			}
		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.print(mas[i][j] + " ");

			}

			System.out.println();
		}

	}

}
