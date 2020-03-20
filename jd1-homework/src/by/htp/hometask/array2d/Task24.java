package by.htp.hometask.array2d;

//24. Дан линейный массив  x1, x2,..., x*(n−1), x*n . 
//Получить действительную квадратную матрицу порядка n: 

//|  X1  X2    X3  ...  Xn |
//| X1^2 X2^2 X3^2 ... Xn^2|
//| X1^3 X2^3 X3^2 ... Xn^3|
//| X1^4 X2^4 X3^4 ... Xn^4|
//|   .    .    .  ...  .  |
//|	  .    .    .  ...  .  |
//|   .    .    .  ...  .  |
//| X1^n X2^n Xn^2 ... Xn^n|  

public class Task24 {

	public static void main(String[] args) {

		int n;
		n = 6;

		int[] linearMas = { 2, 4, 6, 8, 10, 12 };

		int[][] squareMas = new int[n][n];

		for (int i = 0; i < squareMas.length; i++) {

			for (int j = 0; j < squareMas[i].length; j++) {

				squareMas[i][j] = (int) Math.pow(linearMas[j], i + 1);
			}
		}

		for (int i = 0; i < squareMas.length; i++) {

			for (int j = 0; j < squareMas[i].length; j++) {

				System.out.printf("%10d", squareMas[i][j]);
			}
			System.out.println();
		}
	}

}
