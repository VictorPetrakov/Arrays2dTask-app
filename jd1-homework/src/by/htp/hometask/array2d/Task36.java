package by.htp.hometask.array2d;

import java.util.Random;

//36. Операция сглаживания матрицы дает новую матрицу того же размера, каждый элемент 
//которой получается как  среднее  арифметическое  соседей  соответствующего  элемента  
//исходной  матрицы.  Построить  результат сглаживания заданной матрицы

public class Task36 {

	public static void main(String[] args) {

		int n;
		int m;

		n = 4;
		m = 4;

		int[][] mas = new int[n][m];
		double[][] mas1 = new double[n][m];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = rand.nextInt(15);

			}
		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.printf("%4d", mas[i][j]);

			}

			System.out.println();

		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				if (i == 0 && j == 0) {

					mas1[i][j] = (mas[i + 1][j] + mas[i][j + 1]) / 2.0;
				}
				if (i == 0 && j > 0 && j < mas[i].length - 1) {

					mas1[i][j] = (mas[i][j - 1] + mas[i + 1][j] + mas[i][j + 1]) / 3.0;
				}

				if (i == 0 && j == mas[i].length - 1) {

					mas1[i][j] = (mas[i][j - 1] + mas[i + 1][j]) / 2.0;
				}

				if (i > 0 && j > 0 && i < mas.length - 1 && j < mas[i].length - 1) {

					mas1[i][j] = (mas[i - 1][j] + mas[i][j - 1] + mas[i + 1][j] + mas[i][j + 1]) / 4.0;
				}

				if (i > 0 && j == 0 && i < mas.length - 1) {

					mas1[i][j] = (mas[i - 1][j] + mas[i][j + 1] + mas[i + 1][j]) / 3.0;
				}

				if (i == (mas.length - 1) && j == 0) {

					mas1[i][j] = (mas[i - 1][j] + mas[i][j + 1]) / 2.0;
				}

				if (i == (mas.length - 1) && j == mas[i].length - 1) {

					mas1[i][j] = (mas[i - 1][j] + mas[i][j - 1]) / 2.0;
				}
				if (i == (mas.length - 1) && j > 0 && j < mas[i].length - 1) {

					mas1[i][j] = (mas[i - 1][j] + mas[i][j + 1] + mas[i][j - 1]) / 3.0;
				}

				if (i == 0 && j == mas[i].length - 1) {

					mas1[i][j] = (mas[i][j - 1] + mas[i + 1][j]) / 2;
				}

				if (i > 0 && j == mas[i].length - 1 && i < mas.length - 1) {

					mas1[i][j] = (mas[i][j - 1] + mas[i - 1][j] + mas[i + 1][j]) / 3.0;
				}
			}
		}

		System.out.println();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.printf("%10f", mas1[i][j]);

			}

			System.out.println();

		}
	}

}
