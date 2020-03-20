package by.htp.hometask.array2d;

import java.util.Random;

//30. Матрицу 10x20 заполнить случайными числами от 0 до 15. 
//Вывести на экран саму матрицу и номера строк, в 
//которых число 5 встречается три и более раз.

public class Task30 {

	public static void main(String[] args) {

		int n;
		int m;
		int count;

		n = 10;
		m = 20;

		int[][] mas = new int[n][m];
		int[] mas1 = new int[n];

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
			
			count = 0;
			
			for (int j = 0; j < mas[i].length; j++) {

				if (mas[i][j] == 5) {

					count++;
				}
			}
			mas1[i] = count;
		}

		System.out.println("Номера строк в которых 5 попадается более 3 раз ");

		for (int i = 0; i < mas1.length; i++) {

			if (mas1[i] > 3) {

				System.out.printf("%4d", i);
			}

		}

	}

}
