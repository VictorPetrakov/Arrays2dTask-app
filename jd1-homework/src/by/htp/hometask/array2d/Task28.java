package by.htp.hometask.array2d;

import java.util.Random;

//28. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
//Определить, какой столбец содержит максимальную сумму. 

public class Task28 {

	public static void main(String[] args) {

		int n;
		int m;
		int max;
		int index; 
		index = 0;

		n = 4;
		m = 4;

		int mas[][] = new int[n][m];
		
		int[] maxValue = new int[m];
		
		int[] indexMas = new int[m];

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

		for (int i = 0; i < mas.length; i++) { // сумма элементов в каждом столбце

			int sum;
			sum = 0;

			for (int j = 0; j < mas[i].length; j++) {

				sum = sum + mas[j][i];
			}

			System.out.println("Сумма элементов " + (i + 1) + " cтолбца равна " + sum);

			maxValue[i] = sum;

			indexMas[i] = i;

		}

		System.out.println();

		
		max = maxValue[0];

		for (int i = 0; i < maxValue.length; i++) {

			if (max < maxValue[i]) {

				max = maxValue[i];
				
				index = indexMas[i] + 1;
			}

		}

		System.out.println("Максимальная сумма значений в " + index + " столбце " + max);

	}

}
