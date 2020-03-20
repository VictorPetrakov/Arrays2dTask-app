package by.htp.hometask.array2d;

import java.util.Random;

//7. Дан двухмерный массив 5x5. Найти сумму модулей отрицательных нечетных элементов

public class Task07 {

	public static void main(String[] args) {

		int n;
		int m;
		int l;
		
		n = 6; 
		m = 4; 
		l = 0;
		
		int mas [][] = new int[n][m];
		
		Random rand = new Random();
		
		for (int i = 0 ; i < mas.length; i++){
			
			for (int j = 0 ; j < mas[i].length; j++){
				
			mas[i][j] = rand.nextInt(10);
			
			}
		}
		
		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.print(mas[i][j] + " ");

			}

			System.out.println();
		}

		for (int i = 0 ; i < mas.length; i++){

			for (int j = 0 ; j < mas[i].length; j++){
				
				if(mas[i][j] < 0 && mas[i][j] % 2 == 1) {
					
					l = l + Math.abs(mas[i][j]);
				}
				
				
			}
			
		}
		
		System.out.println("Сумма равна: " + l);	
		
	}

}
