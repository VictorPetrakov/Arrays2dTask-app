package by.htp.hometask.array2d;

//40. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из 
//чисел 1, 2, 3, ..., n2  так, что суммы по каждому столбцу, каждой строке и каждой из двух больших
//диагоналей равны между собой. Построить такой квадрат. Пример магического квадрата порядка 3: 
//
//	6  1  8 
//  7  5  3 
//  2  9  4

public class Task40 {

	public static void main(String[] args) {

		int n;
		int m;

		n = 5;
		m = 5;

		int[][] mas = new int[n][m];

		int num = 1;

		int nn = n * 3 / 2;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				mas[(j - i + nn) % n][(i * 2 - j + n) % n] = num++;

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
