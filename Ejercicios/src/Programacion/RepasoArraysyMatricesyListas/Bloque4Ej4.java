package Programacion.RepasoArraysyMatricesyListas;

public class Bloque4Ej4 {

		public static void main (String args[]) {
			int matriz[][] = creaMatriz();
			comprobacionPositiva(matriz);
			imprimeMatriz(matriz);
			//System.out.println("Sim�trica: " + matrizSimetrica(matriz));
		}
			private static int i=0;
			private static int j=0;
			private static int ContadorPositivos=0;
			private static boolean Positiva=true;

			/**
			 * @return 
			 */
			private static int[][] creaMatriz () {
				int matriz[][] = new int[5][5];
				
				for (int i = 0; i < matriz.length; i++) {
					for (int j = 0; j < matriz[0].length; j++) {
						matriz[i][j] = (int) Math.round(Math.random()*100);
					}
				}
				return matriz;
			}
				// Otra forma
				/*int matriz[][] = new int[][] {
					{1,		6, 		11, 	16, 	21},
					{6, 	7, 		12,		17,		22},
					{11, 	12, 	13, 	18, 	23},
					{16, 	17, 	18, 	19, 	24},
					{21, 	22, 	23, 	24, 	25}
				};
				
				return matriz;*/
			
			
			
			/**
			 * 
			 * @param matriz
			 */
			private static void imprimeMatriz (int matriz[][]) {
				
				for (int i = 0; i < matriz.length; i++) {
					for (int j = 0; j < matriz[i].length; j++) {
						System.out.print(matriz[i][j] + "\t");
					}
					System.out.println();
				}
				
			}
			
			
			/**
			 * 
			 * @param matriz
			 * @return 
			 * @return
			 */
			
			private static void comprobacionPositiva(int matriz[][]) {
				
				for (i=0;i<matriz.length;i++) {
					for (j=0;j<matriz.length;i++) {
						if (matriz[i][j]>=0) {
							ContadorPositivos++;
						}
						if(ContadorPositivos==matriz.length) {
							System.out.println("La matriz es positiva");
						}
						else
						{
							System.out.println("La matriz es negativa");
						}
					}
				}
			}
			/*private static boolean matrizSimetrica (int matriz[][]) {
				boolean simetrica = true;

				for (int i = 0; i < matriz.length; i++) {
					for (int j = 0; j < matriz[i].length; j++) {
						if (matriz[i][j] != matriz[j][i])
							simetrica = false;
					}
				}
				return simetrica;
			}
		*/


	}


