package by.htp.hometask.array2d;

import java.util.Random;

//9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали

public class Task09 {

	public static void main(String[] args) {

		int n;
		int m;

		n = 5;
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

		System.out.println("Элементы стоящие по диагонали :");
		
		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i][i] + " ");

			System.out.println();
		}
	}

}
