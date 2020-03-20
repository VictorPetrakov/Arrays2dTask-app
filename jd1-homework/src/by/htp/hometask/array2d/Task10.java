package by.htp.hometask.array2d;

import java.util.Random;

//10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы. 

public class Task10 {

	public static void main(String[] args) {

		int n;
		int m;
		int k;
		int p;

		n = 6;
		m = 5;
		k = 2;
		p = 3;

		int mas[][] = new int[n][m];

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

		System.out.println(k + "-я строка :");

		for (int i = 0; i < mas.length - 1; i++) {

			System.out.print(mas[k][i] + " ");

		}

		System.out.println("\n" + p + "-й столбец :");

		for (int j = 0; j < mas.length; j++) {

			System.out.println(mas[j][p] + " ");
		}

	}

}
