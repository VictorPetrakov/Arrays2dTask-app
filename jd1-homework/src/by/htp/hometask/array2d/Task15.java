package by.htp.hometask.array2d;

//15. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

//| n  0  0  ... 0  0  0|
//| 0 n-1 0  ... 0  0  0|
//| 0  0 n-2 ... 0  0  0|
//| 0  0  0  ... 3  0  0| 
//| 0  0  0  ... 0  2  0|
//| 0  0  0  ... 0  0  1|

public class Task15 {

	public static void main(String[] args) {
		
		int n;
		int m;

		n = 6;
		m = 6;

		int mas[][] = new int[n][m];

		for (int i = 0; i < mas.length; i++) {

			mas[i][i] = mas.length - i;
			
		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.print(mas[i][j] + " ");

			}

			System.out.println();
		}

	}

}
