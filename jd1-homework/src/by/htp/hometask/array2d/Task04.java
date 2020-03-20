package by.htp.hometask.array2d;

import java.util.Random;

//4. Дана матрица. Вывести на экран первую и последнюю строки

public class Task04 {

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
		
		System.out.println();
		
		System.out.println("Первая сторка :");
		
		for(int j = 0 ; j < mas[mas.length - 1].length; j++){
				
			System.out.print(mas[0][j] + " ");
			
		}
			
			System.out.println();
			
			System.out.println("Последняя сторка :");
			
		for(int j = 0 ; j < mas[mas.length - 1].length; j++){
				
			System.out.print(mas[mas.length - 1][j] + " ");	
			
		}
		System.out.println();
	}

}
