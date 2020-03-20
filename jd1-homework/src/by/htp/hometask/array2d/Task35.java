package by.htp.hometask.array2d;

import java.util.Random;

//35. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него

public class Task35 {

	public static void main(String[] args) {

		int n;
		int m;

		n = 6;
		m = 6;

		int max;// максимальное значение элемента в строке
		int maxValue;// максимальное значение элемента в матрице
		int[] maxValueMas = new int[n];// массив наименьших значений каждой строки

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

		for (int i = 0; i < mas.length; i++) {// поиск максимального элемента в каждой строке

			max = mas[i][0];

			for (int j = 0; j < mas[i].length; j++) {

				if (max < mas[i][j]) {

					max = mas[i][j];

				}
				maxValueMas[i] = max;
			}
		}

		maxValue = maxValueMas[0];

		for (int i = 0; i < maxValueMas.length; i++) { // нахождение максимального элемента матрицы

			if (maxValueMas[i] > maxValue) {

				maxValue = maxValueMas[i];

			}
		}

		System.out.println();
		

		for (int i = 0; i < mas.length; i++) {//замена максимальным значением всех нечетных элементов матрицы

			for (int j = 0; j < mas[i].length; j++) {

				if (mas[i][j] % 2 != 0) {

					mas[i][j] = maxValue;
				}
			}
		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.printf("%4d", mas[i][j]);

			}

			System.out.println();

		}

	}

}
