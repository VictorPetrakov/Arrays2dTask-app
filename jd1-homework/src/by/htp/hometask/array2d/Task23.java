package by.htp.hometask.array2d;

//23. Сформировать квадратную матрицу порядка N по правилу:  

//A[i,j] = sin((i^2 - j^2) / N);

public class Task23 {

	public static void main(String[] args) {

		int n;

		n = 6;

		int count;
		count = 0;

		double[][] mas = new double[n][n];

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				double x;
				x = Math.pow(i, 2) - Math.pow(j, 2);

				mas[i][j] = Math.sin(x / mas.length);
			}
		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.printf("%10f", mas[i][j]);

				if (mas[i][j] > 0) {

					count++;

				}
			}

			System.out.println();
		}

		System.out.println("Количество четных элементов матрицы : " + count);

	}

}
