import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

interface Correcion{
	Scanner input = new Scanner(System.in);
	
	public static int validacion() {
		int r = 0;
		boolean e = false;
		do {
			try {
				r = input.nextInt();
			} catch (java.util.InputMismatchException h) {
				System.out.println("Ups... Solo numeros porfavor, intenta de nuevo:");
				input.nextLine();
				e=true;
			}
			if (r>0) {
				e=false;
			}else {
				System.out.println("Solo numeros mayores a 0 por favor, intenta de nuevo:");
				e=true;
			}
		}while(e);
		return r;
	}
}


class MetodosOrdenamiento{
	static long tInicio, tFin;
	static class Burbuja{
	
		
		public static void ordenacionBurbuja1(int [] numeros) {
		int comparaciones=0;
		int intercambios=0;
		int pasadas = 0;
			
			tInicio = System.nanoTime();
			pasadas=pasadas+1;
			for (int i = 1;i<=numeros.length; i++) {
				pasadas = pasadas +1;
				for (int j = 0;j<=numeros.length-i-1; j++) {
					comparaciones= comparaciones +1;
					if(numeros[j+1]<numeros[j]) {
						
						int aux =numeros[j];
						numeros[j] = numeros[j+1];
						numeros[j+1] = aux;
						intercambios = intercambios + 1;
						}
					}
				}
		
			
			tFin = System.nanoTime()-tInicio;
			System.out.println("Tiempo de ejecucion:" + tFin);
			System.out.println("Numero de Intercambios = " + intercambios);
			System.out.println("Numeor de Comparaciones = " + comparaciones);
			System.out.println("Numero de Pasadas = " + pasadas);
			tInicio = 0;
			tFin = 0;
		}//Metodo OrdenacionBurbuja1
		public static void ordenacionBurbuja2(int[] numers) {
			System.out.println("======ordenacionBurbuja2======");
			int[] numeros = numers;
			int comparaciones=0;
			int intercambios=0;
			int pasadas = 0;
			
			int i =1;
			boolean o=false;
			tInicio = System.nanoTime();
			pasadas ++;
			while (i<numeros.length) {
				i+=1;
				o=true;
				pasadas++;
				for (int j = 0; j < numeros.length-i-1; j++) {
					comparaciones++;
					if(numeros[j]>numeros[j+1]) {
					
						o=false;
						int aux = numeros[j];
						numeros[j]=numeros[j+1];
						numeros[j+1]=aux;
						intercambios++;
					}
					
				}
			}
			tFin = System.nanoTime();
			System.out.println("Tiempo de ejecucion:"+(tFin-tInicio));
			System.out.println("Numero de Intercambios = " + intercambios);
			System.out.println("Numeor de Comparaciones = " + comparaciones);
			System.out.println("Numero de Pasadas = " + pasadas);
			
		}
		public static void ordenacionBurbuja3(int[] nums) {
			int[] numeros = nums;
			int comparaciones=0;
			int intercambios=0;
			int pasadas = 0;
			
			int i =1;
			tInicio = System.nanoTime();
			pasadas++;
			do{
				i+=1;
				boolean o=true;
				pasadas = pasadas +1;
				for (int j = 0; j < numeros.length-i; j++) {
					comparaciones++;
					if(numeros[j]>numeros[j+1]) {
						
						o=false;
						int aux = numeros[j];
						numeros[j]=numeros[j+1];
						numeros[j+1]=aux;
						intercambios++;
					}
					
				}
			}while (i<numeros.length);
			tFin = System.nanoTime();
			System.out.println("Tiempo de ejecucion:"+(tFin-tInicio));
			System.out.println("Numero de Intercambios = " + intercambios);
			System.out.println("Numeor de Comparaciones = " + comparaciones);
			System.out.println("Numero de Pasadas = " + pasadas);
			tFin = 0;
			tInicio = 0;
		}
	
	public static void mostrarVector(int [] numeros) {
		System.out.println(Arrays.toString(numeros));
	}
	
	
		
	
	}//Class Burbuja
	
	static class Insercion{
		public static void ordenarInsercion(int [] numeros) {
			int aux;
			int comparaciones=0;
			int intercambios=0;
			int pasadas = 0;
			tInicio = 0;
			tFin = 0;
			
			tInicio = System.nanoTime();
			pasadas++;
			for (int i = 1; i < numeros.length; i++) {
				aux=numeros[i];
				pasadas++;
				comparaciones++;
				for (int j = i-1; j>=0 && numeros[j]>aux; j--) {
					numeros[j+1]=numeros[j];
					numeros[j]=aux;
					comparaciones++;
					intercambios++;
				}
			}
			tFin=System.nanoTime();
			System.out.println("Tiempo de ejecucion: " + (tFin-tInicio));
			System.out.println("Numero de Intercambios = " + intercambios);
			System.out.println("Numeor de Comparaciones = " + comparaciones);
			System.out.println("Numero de Pasadas = " + pasadas);
		}

	}//Class Insercion}
	
	static class Seleccion{
		static public void ordenamientoSeleccion(int[] numeros) {
			int comparaciones=0;
			int intercambios=0;
			int pasadas = 0;
			tInicio = 0;
			tFin = 0;
	
			tInicio = System.nanoTime();
			pasadas++;
			for (int i = 0; i < numeros.length-1; i++) {
				pasadas++;
				for (int j = i; j < numeros.length; j++) {
				comparaciones++;
				if(numeros[i]>numeros[j]) {
					intercambios++;
					int minimo = numeros[i];
					numeros[i] = numeros[j];
					numeros[j]= minimo;
				}
				
			}
			
			}
			tFin = System.nanoTime();
			System.out.println("Tiempo de ejecucion: " + (tFin-tInicio));
			System.out.println("Numero de Intercambios = " + intercambios);
			System.out.println("Numeor de Comparaciones = " + comparaciones);
			System.out.println("Numero de Pasadas = " + pasadas);
		}
	}//class seleccion
	
	
	static class Quiqsort{
		static int comparaciones=0;
		static int intercambios=0;
		static int pasadas = 0;
		static public int[] quicksort(int[] numeros,int izq,int der) {
			int pivote = numeros[izq];
			int i = izq, j = der;
			int aux;
			pasadas++;
			while(i<j) {
				pasadas++;
				comparaciones++;
				while(numeros[i]<=pivote && i<j) {
					i++;
					pasadas++;
					comparaciones++;
				}
				while(numeros[j]>pivote) {
					
					j--;
				}
				if(i<j) {
						intercambios++;
					aux = numeros[i];
					numeros[i]=numeros[j];
					numeros[j] = aux;
				}
			}
			intercambios++;
			numeros[izq]=numeros[j];
			numeros[j]=pivote;
			
			if(izq<j-1)
				quicksort(numeros,izq,j-1);
			comparaciones++;
			if(j+1<der)
				quicksort(numeros, j+1, der);
			return numeros;
		}
		static public void mostarQuicksort(int[] numeros, int izq,int der) {
			tInicio = 0;
			tFin = 0;
			
			tInicio = System.nanoTime();
			quicksort(numeros, izq, der);
			tFin = System.nanoTime();
			System.out.println("Tiempo de ejecucion: " + (tFin-tInicio));
			System.out.println("Numero de Intercambios = " + intercambios);
			System.out.println("Numeor de Comparaciones = " + comparaciones);
			System.out.println("Numero de Pasadas = " + pasadas);
		}
		
	}
	static class Shellsort{
		static public void sellsort(int[] numeros) {
			int comparaciones=0;
			int intercambios=0;
			int pasadas = 0;
			int intervalo = numeros.length/2;
			tInicio = System.nanoTime();
			pasadas++;
			while(intervalo>0) {
				pasadas++;
				for(int i = intervalo; numeros.length>i;i++ ) {
					int j = i-intervalo;
					pasadas++;
					while(j>=0) {
						int k = j+intervalo;
						comparaciones++;
						if(numeros[j]<=numeros[k]) {
							j =-1;
							
						}else {
							int aux = numeros[j];
							numeros[j] = numeros[k];
							numeros[k] = aux;
							intercambios++;
							j-=intervalo;
						}
						pasadas++;
					}
					
				}
				intervalo = intervalo/2;
				
			}
		tFin=	System.nanoTime();
		System.out.println("Tiempo de ejecucion: " + (tFin-tInicio));
		System.out.println("Numero de Intercambios = " + intercambios);
		System.out.println("Numeor de Comparaciones = " + comparaciones);
		System.out.println("Numero de Pasadas = " + pasadas);
		
		}
		
}//Shellsort
	static class RadixSort{
		
		static public void radix(int[] numeros) {
			int comparaciones=0;
			int intercambios=0;
			int pasadas = 0;
			tInicio = System.nanoTime();
			if(numeros.length == 0)
	              return;
	              int[][] np = new int[numeros.length][2];
	              int[] q = new int[0x100];
	              int i,j,k,l,f = 0;
	              pasadas++;
	              for(k=0;k<4;k++) {
	            	  pasadas++;
	                 for(i=0;i<(np.length-1);i++)
	                 np[i][1] = i+1;
	                 np[i][1] = -1;
	                 pasadas++;
	                 for(i=0;i<q.length;i++)
	                 q[i] = -1;
	                 pasadas++;
	                 for(f=i=0;i<numeros.length;i++) {
	                    j = ((0xFF<<(k<<3))&numeros[i])>>(k<<3);
	                  comparaciones++;
	                    if(q[j] == -1)
	                  
	                    l = q[j] = f;
	                 else {
	                    l = q[j];
	                    pasadas++;
	                    while(np[l][1] != -1)
	                    l = np[l][1];
	                    np[l][1] = f;
	                    l = np[l][1];
	                    intercambios++;
	                 }
	                 f = np[f][1];
	                 np[l][0] = numeros[i];
	                 np[l][1] = -1;
	                 intercambios++;
	              }
	              for(l=q[i=j=0];i<0x100;i++)
	              for(l=q[i];l!=-1;l=np[l][1])
	                  numeros[j++] = np[l][0];
	           }//for
	              tFin =System.nanoTime();
	              System.out.println("Tiempo de ejecucion: " + (tFin-tInicio));
	      		System.out.println("Numero de Intercambios = " + intercambios);
	      		System.out.println("Numeor de Comparaciones = " + comparaciones);
	      		System.out.println("Numero de Pasadas = " + pasadas);
	    }//metodo
	}//class Radix
		
	
	

	
	
}//CLass MetodosOrdenamiento




public class PruebasDeEstresOrdenamiento {
	public static void main(String[] args) {
		
		
		
		//Agregar MENU!
		int opcion = 0;
		int ooo;
		//Random aleatorio = new Random(System.currentTimeMillis());
		do {
			System.out.println("Digite 1 para usar un vector aleatorio de 1000 datos");
			System.out.println("Digite 2 para usar un vector aleatorio de 10000 datos");
			System.out.println("Digite 3 para usar un vector aleatorio de 100000 datos");
			//System.out.println("Digite 1 para usar un vector aleatorio de 1000000 datos"); No me dejo :(
			ooo = Correcion.validacion(); 
		}while(ooo!=1 && ooo!=2 && ooo!=3);
		
		int numeros[] = {2};
		
		 if(ooo==1) {
			 numeros = new int[1000];
			for (int i = 0; i < 1000; i++) {
				numeros[i]=(int)(Math.random()*1000);
			}
		}else if(ooo==2) {
			numeros = new int[10000];
			for (int i = 0; i < 10000; i++) {
				numeros[i]=(int)(Math.random()*1000);
			}
		}else if(ooo==3) {
			numeros = new int[100000];
			for (int i = 0; i < 100000; i++) {
				numeros[i]=(int)(Math.random()*1000);
			}
		}
	
		int numeros2[];
		do{
			numeros2 = numeros.clone();
			System.out.println("======================== MENU ========================");
			System.out.println("Digite 1 para usar el metodo de ordenacion BURBUJA");
			System.out.println("Digite 2 para usar el metodo de Ordenamiento INSERCION");
			System.out.println("Digite 3 para usar el metodo de Ordenamiento SELECCION ");
			System.out.println("Digite 4 para usar el metodo de Ordenamiento QUICKSORT");
			System.out.println("Digite 5 para usar el metodo de ordenamiento SHELLSORT");
			System.out.println("Digite 6 para usar el metodo de ordenamiento RADIXSORT");
			System.out.println("Digite 7 para ***SALIR***");
			opcion = Correcion.validacion();
			switch (opcion) {
			case 1:
				//numeros2 = numeros;
				System.out.println("Digite 1 para usar le metodo de Burbuja 1");
				System.out.println("Digite 2 para usar le metodo de Burbuja 2");
				System.out.println("Digite 3 para usar le metodo de Burbuja 3");
				int op2 = Correcion.validacion();
				if(op2==1) {
					System.out.println("Metodo de la burbuaja #1");
					System.out.println("===== Vector DESORDENADO =====");
					MetodosOrdenamiento.Burbuja.mostrarVector(numeros2);
					MetodosOrdenamiento.Burbuja.ordenacionBurbuja1(numeros2);
					System.out.println("===== Vector ORDENADO =====");
					MetodosOrdenamiento.Burbuja.mostrarVector(numeros2);
				}else if(op2==2) {
					System.out.println("Metodo de la burbuaja #2");
					System.out.println("===== Vector DESORDENADO =====");
					MetodosOrdenamiento.Burbuja.mostrarVector(numeros2);
					MetodosOrdenamiento.Burbuja.ordenacionBurbuja2(numeros2);
					System.out.println("===== Vector ORDENADO =====");
					MetodosOrdenamiento.Burbuja.mostrarVector(numeros2);
				}else if(op2==3){
					System.out.println("Metodo de la burbuaja #2");
					System.out.println("===== Vector DESORDENADO =====");
					MetodosOrdenamiento.Burbuja.mostrarVector(numeros2);
					MetodosOrdenamiento.Burbuja.ordenacionBurbuja2(numeros2);
					System.out.println("===== Vector ORDENADO =====");
					MetodosOrdenamiento.Burbuja.mostrarVector(numeros2);
				}else {
					System.out.println("Opcion no disponible");
				}
			
			
				break;
			
			case 2: 
				//numeros2 = numeros;
				System.out.println("=== Metodo de Insercion ===");
				System.out.println("Desordenados:" + Arrays.toString(numeros2));
				MetodosOrdenamiento.Insercion.ordenarInsercion(numeros2);
				System.out.println("Ordenados: " + Arrays.toString(numeros2));
					break;
			case 4:
				System.out.println("===== Metodo de QuickSort =====");
				//numeros2 = numeros;
				System.out.println("Desordenado: " + Arrays.toString(numeros2));
				MetodosOrdenamiento.Quiqsort.mostarQuicksort(numeros2, 0, numeros2.length-1);
				System.out.println("Ordenado: " + Arrays.toString(numeros2));break;
			case 3:
				//numeros2 = numeros;
				System.out.println("===== Metodo de Seleccion ===== ");
				System.out.println("Desordenados: " + Arrays.toString(numeros2));
				MetodosOrdenamiento.Seleccion.ordenamientoSeleccion(numeros2);
				System.out.println("Ordenado: " + Arrays.toString(numeros2));break;
			case 7: 
				System.out.println("Gracias por usar");
				break;
			case 5: 
				System.out.println("===== Metodo de Shellsort =====");
				System.out.println("Desordenado: " + Arrays.toString(numeros2));
				MetodosOrdenamiento.Shellsort.sellsort(numeros2);
				System.out.println("Ordenado: " +Arrays.toString(numeros2));
				break;
			case 6: 
				System.out.println("===== Metodo de Radixsort =====");
				System.out.println("Desordenado: " + Arrays.toString(numeros2));
				MetodosOrdenamiento.RadixSort.radix(numeros2);
				System.out.println("Ordenado: " +Arrays.toString(numeros2));
			}
		}while (opcion!=7);//Usar aqui el numero de ***SALIR***
		
		
		
		
		//LLenar el vector con 1 millon de datos aleatorios!!!!!
		
		
		/*Cantidad de pasadas
		 * Cantidad de comparaciones
		 * cantidad de intercambios 
		 */
	
		
	}

}
