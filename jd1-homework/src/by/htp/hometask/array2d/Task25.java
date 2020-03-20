package by.htp.hometask.array2d;

//25. Получить квадратную матрицу порядка n:

//|     1          2      ...   n-1   n |
//|    n+1        n+2     ...  2n-1  2n |
//|   2n+1       2n+2     ...  3n-1  3n |
//|     .          .      ...    .    . | 
//|     .          .      ...    .    . |
//| (n-1)(n+1) (n-2)(n+2) ... n^2+1  n^2|

public class Task25 {

	public static void main(String[] args) {

		int n;
		n = 8;

		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas.length; j++) {

				mas[i][j] = n * i + j + 1;

			}
		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.printf("%5d", mas[i][j]);
			}
			System.out.println();
		}

	}

}
