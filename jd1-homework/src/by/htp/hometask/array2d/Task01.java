package by.htp.hometask.array2d;

//1. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была ровно 
//одна единица, и вывести на экран. 


public class Task01 {

	public static void main(String[] args) {

		int n;
		int m;
		
		n = 3;
		m = 4;
		
		int mas [][] = new int[n][m];
		
		for (int i = 0 ; i < mas.length; i++){
			
			for (int j = 0 ; j < mas[i].length; j++){
				
				mas[i][0] = 1;
			
			}
		}
		
		for (int i = 1 ; i < mas.length; i++){
			
			for (int j = 1 ; j < mas[i].length; j++){
				
				mas[i][j] = 0;
			
			}
		}
     
		for (int i = 0 ; i < mas.length; i++){
			
			for (int j = 0 ; j < mas[i].length; j++){
				
				System.out.print(mas[i][j] + " ");
				
			}
			System.out.println();	
		}
	}

}
