package by.htp.hometask.array2d;

import java.util.Random;

//8.  Дан  двухмерный  массив  NxM  элементов.  Определить,  сколько  раз  встречается
//число  7  среди  элементов массива. 

public class Task08 {

	public static void main(String[] args) {

		int n;
		int m;
		int count;

		n = 6;
		m = 5;
		count = 0;

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

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				if (mas[i][j] == 7) {

					count++;
				}

			}

		}

		System.out.println("Число 7 встречается " + count + " раз(а) !");

	}

}
