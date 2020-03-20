package by.htp.hometask.array2d;

// 17. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

//| 1  1  1  ... 1  1  1|
//| 1  0  0  ... 0  0  1|
//| 1  0  0  ... 0  0  1|
//| 1  0  0  ... 0  0  1| 
//| 1  0  0  ... 0  0  1|
//| 1  1  1  ... 1  1  1|
public class Task17 {

	public static void main(String[] args) {

		int n;
		int m;

		n = 6;
		m = 6;

		int mas[][] = new int[n][m];

		for (int i = 0; i < mas.length; i++) {

			mas[i][0] = 1;
			mas[i][mas.length - 1] = 1;
		}

		for (int j = 0; j < mas.length - 1; j++) {

			mas[0][j] = 1;
			mas[mas.length - 1][j] = 1;
		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.print(mas[i][j] + " ");

			}

			System.out.println();
		}
	}

}
