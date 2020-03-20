package by.htp.hometask.array2d;

import java.util.Random;

//29. Найти положительные элементы главной диагонали квадратной матрицы.

public class Task29 {

	public static void main(String[] args) {
		int n;
		int m;

		n = 4;
		m = 4;

		int mas[][] = new int[n][m];
		int[] mas1 = new int[n];
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = rand.nextInt(10);

			}
		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.print(mas[i][j] + " ");

			}

			System.out.println();
		}

		System.out.println("Положительные элементы главной диагонали ");

		for (int i = 0; i < mas.length; i++) {

			if (mas[i][i] > 0) {

				mas1[i] = mas[i][i];

				System.out.print(mas1[i] + " ");
			}
		}

	}

}
