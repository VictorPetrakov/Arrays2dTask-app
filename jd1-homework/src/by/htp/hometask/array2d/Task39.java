package by.htp.hometask.array2d;

import java.util.Random;

//39. Найдите произведение двух матриц. 

public class Task39 {

	public static void main(String[] args) {

		int n;
		int m;

		n = 3;
		m = 3;

		int[][] mas = new int[n][m];
		int[][] mas1 = new int[n][m];
		int[][] compositionMas = new int[n][m];

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
		System.out.println("Произведение А и Б ");

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				for (int k = 0; k < mas.length; k++) {

					compositionMas[i][j] += mas[i][k] * mas1[k][j];
				}
			}
		}

		System.out.println();

		for (int i = 0; i < compositionMas.length; i++) {

			for (int j = 0; j < compositionMas[i].length; j++) {

				System.out.printf("%4d", compositionMas[i][j]);

			}

			System.out.println();

		}

	}

}
