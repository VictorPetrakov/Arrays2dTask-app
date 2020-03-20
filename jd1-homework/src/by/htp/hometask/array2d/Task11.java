package by.htp.hometask.array2d;

import java.util.Random;

//11. Дана матрица размера m x n. Вывести ее элементы в следующем порядке: 
//первая строка справа налево, вторая строка слева направо, третья строка справа налево и так далее. 

public class Task11 {

	public static void main(String[] args) {

		int n;
		int m;

		n = 6;
		m = 5;

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

		System.out.println();

		for (int i = 0; i < mas.length; i++) {

			if (i % 2 == 0) {

				for (int j = mas[mas[i].length].length - 1; j >= 0; j--) {

					System.out.print(mas[i][j] + " ");

				}

				System.out.println();

			} else {

				for (int j = 0; j < mas[mas[i].length].length; j++) {

					System.out.print(mas[i][j] + " ");
				}

				System.out.println();
			}
		}
	}

}
