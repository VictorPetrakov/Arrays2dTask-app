package by.htp.hometask.array2d;

import java.util.Scanner;

//26. С клавиатуры вводится двумерный массив чисел размерностью nxm. 
//Выполнить с массивом следующие действия:  
//а) вычислить сумму отрицательных элементов в каждой строке;  
//б) определить максимальный элемент в каждой строке;  
//в) переставить местами максимальный и минимальный элементы матрицы. 

public class Task26 {

	public static void main(String[] args) {

		int n;
		int m;
		int max;// максимальное значение элемента в строке
		int min;// минимальное значение элемента в строке
		int maxValue;// максимальное значение элемента в матрице
		int minValue;// минимальное значение элемента в матрице
		int positionMax;// позиция максимального элемента в матрице
		int positionMin;// позиция минимального элемента в матрице

		positionMax = 0;
		positionMin = 0;

		max = 0;
		min = 0;

		n = scannerInt();
		m = scannerInt();

		int[] maxIndex = new int[n];// массив индексов столбца с наибольшим значением элемента
		int[] minIndex = new int[n];// массив индексов столбца с наименьшим значением элемента
		int[] minValueMas = new int[n];// массив наибольших значений каждой строки
		int[] maxValueMas = new int[n];// массив наименьших значений каждой строки

		int mas[][] = new int[n][m];// заданный массив

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = scannerInt();

			}
		}

		System.out.println("Ваша матрица ");

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.printf("%5d", mas[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < mas.length; i++) { // сумма отрицательных элементов в каждой строке

			int sum;
			sum = 0;

			for (int j = 0; j < mas[i].length; j++) {

				if (mas[i][j] < 0) {

					sum = sum + mas[i][j];
				}
			}

			if (Math.abs(sum) > 0) {

				System.out.println("Сумма отрицательных элементов " + (i + 1) + " cторки равна " + sum);

			} else {
				System.out.println("В " + (i + 1) + " строке нет отрицательных элементов!");
			}
		}

		for (int i = 0; i < mas.length; i++) {// поиск максимального элемента в каждой строке

			max = mas[i][0];

			for (int j = 0; j < mas[i].length; j++) {

				if (max < mas[i][j]) {

					max = mas[i][j];

					maxIndex[i] = j;

				}
				maxValueMas[i] = max;
			}

			System.out.println("Максимальный элемент в " + (i + 1) + " cторке равен " + max);

		}

		for (int i = 0; i < mas.length; i++) {// поиск минимального элемента в каждой строке

			min = mas[i][0];

			for (int j = 0; j < mas[i].length; j++) {

				if (min > mas[i][j]) {

					min = mas[i][j];

					minIndex[i] = j;

				}
				minValueMas[i] = min;
			}

			System.out.println("Минимальный элемент в " + (i + 1) + " cторке равен " + min);

		}

		maxValue = maxValueMas[0];

		for (int i = 0; i < maxValueMas.length; i++) { // нахождение максимального элемента матрицы

			if (maxValueMas[i] > maxValue) {

				maxValue = maxValueMas[i];

				positionMax = i;
			}
		}

		minValue = minValueMas[0];

		for (int i = 0; i < minValueMas.length; i++) {// нахождение минимального элемента матрицы

			if (minValueMas[i] < minValue) {

				minValue = minValueMas[i];

				positionMin = i;
			}
		}

		mas[positionMax][maxIndex[positionMax]] = minValue;// замена максимального элемента значением минимального

		mas[positionMin][minIndex[positionMin]] = maxValue;// замена минимального элемента матрицы значением
															// максимального

		System.out.println();

		System.out.println("Матрица после замены максимального на минимальный элемент и наоборот ");

		System.out.println();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.printf("%5d", mas[i][j]);
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
