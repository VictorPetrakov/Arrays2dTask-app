package by.htp.hometask.array2d;

import java.util.Random;

//6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего. 

public class Task06 {

	public static void main(String[] args) {

		int n;
		int m;

		n = 6;
		m = 4;

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

			for (int j = 0; j < mas[i].length; j = j + 1) {

				if (j % 2 != 0 && mas[0][j] > mas[mas.length - 1][j]) {

					System.out.print(mas[i][j] + " ");
				}

			}
			System.out.println();
		}

	}

}
