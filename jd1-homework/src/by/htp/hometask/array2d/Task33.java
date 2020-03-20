package by.htp.hometask.array2d;

import java.util.Random;

//33. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов. 

public class Task33 {

	public static void main(String[] args) {
		
		int n;
		int m;

		n = 6;
		m = 6;

		int[][] mas = new int[n][m];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = rand.nextInt(15);

			}
		}
		
		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.printf("%4d", mas[i][j]);

			}
			
			System.out.println();
			

		}
		System.out.println();
		
		/*for(int k = 0; k < mas.length; k++) {//по возрастанию
			
			for(int j = 0; j < mas.length; j++) {
				
				for (int i = 0; i < mas.length; i++) {
                
					if (mas[k][j] < mas[k][i]) {
                    
						int value = mas[k][j];
                    
						mas[k][j] = mas[k][i];
                    
						mas[k][i] = value;
					}
				}
			}
		}*/	
		
		/*for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.printf("%4d", mas[i][j]);

			}
			
			System.out.println();
			

		}*/
		System.out.println();
	for( int a = 0; a < mas.length; a++) {
		 for (int i=0;  i<m; i++)
             for (int k=i+1; k < m; k++) {
                 if (mas[i][a] > mas[k][a]){
                     for (int j=0; j < m; j++) {
                         int temp = mas[i][j];
                         mas[i][j]=mas[k][j];
                         mas[k][j]=temp;
                     }
                 }
             }
	}
		System.out.println();
		
		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.printf("%4d", mas[i][j]);

			}

			System.out.println();
		}

	}
	}

