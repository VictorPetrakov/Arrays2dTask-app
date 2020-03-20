package by.htp.hometask.array2d;

//12. Получить квадратную матрицу порядка n: у которой элементы стоящие по 
//диагонали заполняются от 0 до N - 1.

public class Task12 {

	public static void main(String[] args) {

		int n;
		int m;

		n = 6;
		m = 6;

		int mas[][] = new int[n][m];

		for (int i = 0; i < mas.length; i++) {

			mas[i][i] = i;

		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.print(mas[i][j] + " ");

			}

			System.out.println();
		}

	}

}
