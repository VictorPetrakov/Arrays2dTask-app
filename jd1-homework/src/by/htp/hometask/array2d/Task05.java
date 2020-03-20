package by.htp.hometask.array2d;

import java.util.Random;

//5. Дана матрица. Вывести на экран все четные строки, то есть с четными номерами. 

public class Task05 {

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

		for (int i = 0; i < mas.length; i = i + 2) {

			for (int j = 0; j < mas[mas.length - 1].length; j++) {

				System.out.print(mas[i][j] + " ");

			}

			System.out.println();
		}
	}
}
