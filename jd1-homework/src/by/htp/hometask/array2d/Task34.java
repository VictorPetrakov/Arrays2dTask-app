package by.htp.hometask.array2d;

//34. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в 
//каждом столбце число 
//единиц равно номеру столбца. 

public class Task34 {

	public static void main(String[] args) {

		int n;
		int m;

		n = 6;
		m = 5;

		int mas[][] = new int[n][m];

		for (int i = mas.length - 1; i >= 0; i--) {

			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = 0;

			}
		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = mas[i].length - 1; i <= j; j--) {

				mas[i][j] = 1;

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
