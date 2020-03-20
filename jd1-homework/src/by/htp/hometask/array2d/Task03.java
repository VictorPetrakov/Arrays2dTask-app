package by.htp.hometask.array2d;

import java.util.Random;

//3. Дана матрица. Вывести на экран первый и последний столбцы

public class Task03 {

	public static void main(String[] args) {

		int n;
		int m;
		
		n = 3;
		m = 4;
		
		int mas[][] = new int [n][m]; 
		
		Random rand = new Random();
		
		for(int i = 0; i < mas.length; i++){
			
			for(int j = 0 ; j < mas[i].length; j++){
				
				mas[i][j] = rand.nextInt(10);
			}
		}

		for(int i = 0; i < mas.length; i++){
			
			for(int j = 0 ; j < mas[i].length; j++){
				
				System.out.print(mas[i][j] + " ");
		
			}
			
			System.out.println();
		}
		
		for(int i = 0 ; i < mas.length; i++){
				
			System.out.print(mas[i][0] + " ");
			
			System.out.println(mas[i][mas[i].length - 1]);	
		}
			
			System.out.println();
	}

}
