package src;
import java.util.Scanner; 
import java.util.Arrays;


public class arrays {
	public static void main(String[] args) {
		
		//exemplos();
		//exercicio1();
		//exercicio1r();
		//exercicio2();
		//listado();
		//somados();
		//exercicio3a();
		//exercicio3b();
		//exercicio4();
		//exercicio5a();
		//exercicio5b();
		//exercicio6a();
		//exercicio6b();
		
	}
	
	
		static void exemplos() {
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars[0]);
		System.out.println(cars[2]);
		
		cars[2] = "Chevrolet";
		System.out.println(cars[2]);
		
		System.out.println("");
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println(i + "->" +cars[i]);
			}
		
		System.out.println("");
		
		int x = 0;
		while(x<cars.length) {
			System.out.println(x + "->" +cars[x]);
			x++;
		}
		System.out.println("");
		for(String c : cars) {
			
			System.out.println(c);
		}
	    }
		static void exercicio1() {
			
			int[] numeros = new int[5];
			 try (Scanner entradaUser = new Scanner(System.in)) {
				int y = 0;
				 while (y<numeros.length) {
					 System.out.println("digite sei número " + (y+1));
					 numeros[y] = entradaUser.nextInt();
					 y++;
					
				 }
			}  
			 System.out.println("");
			int x = 0;
			 while(x<numeros.length) {
					System.out.println("o dobro do número " + numeros[x] + " é " + numeros[x] * 2);
					System.out.println("");
					x++;
			 }
			 
			
		}
		static void exercicio1r() {
			int[] numeros = new int[5];
			 try (Scanner entradaUser = new Scanner(System.in)) {
				for(int i = 0; i<numeros.length; i++) {
					 System.out.print("informe seu número " + (i+1)+": ");
					 numeros[i] = entradaUser.nextInt();
					 System.out.println("");
				 }
			}
			 
			 System.out.println("");
			 for(int n : numeros) {
				 System.out.println("o dobro do número " + n + " é " + n * 2);
			 }
		}
		static void exercicio2() {
			int[] numeros = new int[10];
			try (Scanner entrada = new Scanner(System.in)) {
				for(int i = 0; i<numeros.length; i++) {
					 System.out.print("informe seu número " + (i+1)+": ");
					 numeros[i] = entrada.nextInt();
				}
			}
			 
			System.out.println("");
			
			for(int n : numeros) {
				if((n%2) ==1) {
				 System.out.println("o número " + n + " é impar");}
				else {
				 System.out.println("o número " + n + " é par");}
				}
		}
		static void listado() {
			int [] dados = {1,2,3};
			lista(dados);
		}
		static void lista(int[] dados) {
			for(int n : dados) {
			System.out.println(n);
				
		}

		}
		static int soma(int n2, int n3) {
			return n2+n3;
		}
		static void somados() {
			System.out.println(soma(1, 2));
		}
		static void exercicio3a(){
			
			int[] numeros = new int[10];
			try (Scanner entrada = new Scanner(System.in)) {
				for(int i = 0; i<numeros.length; i++) {
					 System.out.print("informe seu número " + (i+1)+": ");
					 numeros[i] = entrada.nextInt();}
			}
			System.out.println("");
			for(int n = 9; n>=0; n--) {
				System.out.println(numeros[n]);
			}
			
		}
		static void exercicio3b() {
			int[] numeros = {1,2,3,4,5,6,7,8,9,10};
			
			for(int n = 9; n>=0; n--) {
				System.out.println(numeros[n]);}
				
		}
		static void exercicio4() {
			
			int[] numeros = new int[15];
			
			try (Scanner entrada = new Scanner(System.in)) {
				for(int i = 0; i<numeros.length; i++) {
					 System.out.print("informe seu número " + (i+1)+": ");
					 numeros[i] = entrada.nextInt();}
			}
			System.out.println("");
			
			int max = numeros[0];
			for (int n : numeros) {
				  if (n > max) {
				    max = n;} 
			}
			System.out.println("o maior número é o " +max);
			
			 for (int i = 0; i < numeros.length; i++) {
				    if (numeros[i] == max) {
				        System.out.println("ele foi encontrado na posição do array: " + i);}
			 }
			
		}	
		static void exercicio5a() {
			
			int[] numeros = new int[8];
			try (Scanner entrada = new Scanner(System.in)) {
				for(int i = 0; i<numeros.length; i++) {
					 System.out.print("informe seu número " + (i+1)+": ");
					 numeros[i] = entrada.nextInt();}
			}
			System.out.println("");
		
			Arrays.sort(numeros);
			for (int n : numeros) {
				System.out.println(n);
			}	
		}
		static void exercicio5b() {
			int[] numeros = new int[8];
			try (Scanner entrada = new Scanner(System.in)) {
				for(int i = 0; i<numeros.length; i++) {
					 System.out.print("informe seu número " + (i+1)+": ");
					 numeros[i] = entrada.nextInt();}
			}
			for (int i = 0; i < numeros.length - 1; i++) {
			    for (int j = 0; j < numeros.length - 1 - i; j++) {
			        if (numeros[j] > numeros[j + 1]) {
			            int temp = numeros[j];
			            numeros[j] = numeros[j + 1];
			            numeros[j + 1] = temp;}
			        }
			    }
			
			for (int n : numeros) {
				System.out.println(n);}
				
			
		}
		static void exercicio6a() {
			
			int[] numeros = new int[10];
			try (Scanner entrada = new Scanner(System.in)) {
				for(int i = 0; i<numeros.length; i++) {
					 System.out.print("informe sua nota " + (i+1)+": ");
					 numeros[i] = entrada.nextInt();}
			}
			System.out.println("");
			
			for(int n : numeros) {
				if (n>=6) {
					System.out.println("sua nota " +n+" está acima da média");
				}
			}
			
		}
		static void exercicio6b() {
			
			int[] numeros = new int[10];
			try (Scanner entrada = new Scanner(System.in)) {
				for(int i = 0; i<numeros.length; i++) {
					 System.out.print("informe sua nota " + (i+1)+": ");
					 numeros[i] = entrada.nextInt();}
			}
			System.out.println("");
			
			float total=0;
			int tamanho = numeros.length;
			for(int n : numeros) {
				total+=n;
			}
			float media = total/tamanho;
			System.out.println("a média é "+media);
			for(int n2 : numeros) {
				if (n2>media) {
					System.out.println("sua nota " +n2+" está acima da média");
				}
						
			}
			
		}
}


