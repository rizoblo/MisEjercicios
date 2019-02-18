package RepasoArraysyMatrices;

public class Bloque4Ej4 {

		public static void main (String args[]) {
			int matriz[][] = creaMatriz();
			imprimeMatriz(matriz);
			//comprobacionPositiva(matriz);
			//matrizSimetrica(matriz);
			comprobacionDiagonal(matriz);
			
			//System.out.println("Sim�trica: " + matrizSimetrica(matriz));
		}
			private static int i=0;
			private static int j=0;
			private static int ContadorPositivos=0;
			private static boolean diagonal=true;

			/**
			 * @return 
			 */
			private static int[][] creaMatriz () {
				/*int matriz[][] = new int[5][5];
				
				for (int i = 0; i < matriz.length; i++) {
					for (int j = 0; j < matriz[0].length; j++) {
						matriz[i][j] = (int) Math.round(Math.random()*100);
					}
				}
				return matriz;*/
				// Otra forma
				int matriz[][] = new int[][] {
					{1,		0, 		0, 		0, 		0},
					{0, 	7, 		0,		0,		0},
					{0, 	0, 		13, 	0, 		0},
					{0, 	0, 		0, 		18, 	0},
					{0, 	0, 		0, 		0, 		23}
				};
				
				return matriz;
			}
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
					for (j=0;j<matriz.length;j++) {
						if (matriz[i][j]<0) {
							System.out.println("La matriz no es positiva");
							System.exit(0);
						}
					}	
				}
				System.out.println("La matriz es positiva");
			}
			/*
			 * 
			 */
			private static void comprobacionDiagonal(int matriz[][]) {
				diagonal=true;
				for (i=0;i<matriz.length;i++) {
					for (j=0;j<matriz.length;j++) {
						if (matriz[i][j] !=0 && i!=j) {
							diagonal=false;
						}
					}	
				}
				if (diagonal == true ) {
					System.out.println("La matriz es diagonal");
				}
				else
				{
					System.out.println("La matriz no es diagonal");
				}
			}
			/*
			 * 
			 */
			private static boolean matrizSimetrica (int matriz[][]) {
				boolean simetrica = true;

				for (int i = 0; i < matriz.length; i++) {
					for (int j = 0; j < matriz[i].length; j++) {
						if (matriz[i][j] != matriz[j][i])
							simetrica = false;
					}
				}
				return simetrica;
			}
			/*
			 * 
			 */
			private static boolean comprobacionTriangularSuperior(int matriz[][]) {
				for (int i = 0; i < matriz.length; i++) {
					for (int j = 0; j < matriz[i].length; j++) {
						if (matriz[i][j] != matriz[j][i])
							
					}
				}
			}


	}


