package by.htp.hometask.array2d;

import java.util.Random;

//38. Найдите сумму двух матриц

public class Task38 {

	public static void main(String[] args) {

		int n;
		int m;

		n = 4;
		m = 4;

		int[][] mas = new int[n][m];
		int[][] mas1 = new int[n][m];
		int[][] sumMas = new int[n][m];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = rand.nextInt(15);

			}
		}
		System.out.println("Матрица А ");
		System.out.println();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.printf("%4d", mas[i][j]);

			}

			System.out.println();

		}

		for (int i = 0; i < mas1.length; i++) {

			for (int j = 0; j < mas1[i].length; j++) {

				mas1[i][j] = rand.nextInt(15);

			}
		}

		System.out.println();
		System.out.println("Матрица Б ");
		System.out.println();

		for (int i = 0; i < mas1.length; i++) {

			for (int j = 0; j < mas1[i].length; j++) {

				System.out.printf("%4d", mas1[i][j]);

			}

			System.out.println();

		}
		System.out.println();
		System.out.println("Сумма А и Б ");

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				sumMas[i][j] = mas[i][j] + mas1[i][j];
			}
		}

		System.out.println();

		for (int i = 0; i < sumMas.length; i++) {

			for (int j = 0; j < sumMas[i].length; j++) {

				System.out.printf("%4d", sumMas[i][j]);

			}

			System.out.println();

		}
	}

}
