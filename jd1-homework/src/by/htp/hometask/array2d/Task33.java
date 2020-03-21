package by.htp.hometask.array2d;

import java.util.Random;

//33. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов. 

public class Task33 {

	public static void main(String[] args) {

		int n;
		int m;

		n = 6;
		m = 6;

		int[][] mas = new int[n][m];

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
		System.out.println();

		for (int i = 0; i < m; i++) {

			for (int j = 0; j < m; j++) {

				for (int k = i + 1; k < m; k++) {

					if (mas[i][j] < mas[k][j]) {

						int temp = mas[i][j];
						
						mas[i][j] = mas[k][j];
						
						mas[k][j] = temp;
					}
				}
			}
		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.printf("%4d", mas[i][j]);

			}

			System.out.println();

		}

		System.out.println();

		for (int i = 0; i < m; i++) {

			for (int j = 0; j < m; j++) {

				for (int k = i + 1; k < m; k++) {

					if (mas[i][j] > mas[k][j]) {

						int temp = mas[i][j];
						
						mas[i][j] = mas[k][j];
						
						mas[k][j] = temp;
					}
				}
			}
		}
		System.out.println();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.printf("%4d", mas[i][j]);

			}

			System.out.println();
		}

	}
}
