package by.htp.hometask.array2d;

import java.util.Random;
import java.util.Scanner;

//27. В числовой матрице поменять местами два любых столбца, т. е. 
//все элементы одного столбца поставить на соответствующие  им  позиции  другого,  
//а  элементы  второго  переместить  в  первый.  Номера  столбцов  вводит 
//пользователь с клавиатуры.

public class Task27 {

	public static void main(String[] args) {

		int n;
		int m;
		int k = scannerInt();
		int q = scannerInt();

		n = 4;
		m = 4;

		int mas[][] = new int[n][m];
		int mas1[] = new int[n];
		int mas2[] = new int[n];

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

			mas1[i] = mas[i][k];
		}

		for (int i = 0; i < mas.length; i++) {

			mas2[i] = mas[i][q];
		}

		for (int i = 0; i < mas.length; i++) {
			mas[i][q] = mas1[i];
			mas[i][k] = mas2[i];
		}

		System.out.println();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.print(mas[i][j] + " ");

			}

			System.out.println();
		}

	}

	public static int scannerInt() {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		int number;

		System.out.println("Введите число: \r");

		while (!in.hasNextInt()) {

			in.next();

			System.out.println("Некорректный ввод!\r ");
			System.out.println("Введите число: \r");
		}
		number = in.nextInt();

		return number;

	}

}
