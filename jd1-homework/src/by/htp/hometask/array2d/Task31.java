package by.htp.hometask.array2d;

import java.util.Random;

// 31. Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. 
//Посчитать количество двузначных чисел в ней. 

public class Task31 {

	public static void main(String[] args) {

		int n;
		int m;
		int count;
		count = 0;

		n = 6;
		m = 6;

		int[][] mas = new int[n][m];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = rand.nextInt(999);

				if (mas[i][j] > 10 && mas[i][j] < 99) {

					count++;
				}
			}
		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.printf("%4d", mas[i][j]);

			}

			System.out.println();
		}

		System.out.println("Количество двухзначных чисел равно " + count);
	}

}
