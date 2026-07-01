package src;
import java.util.ArrayList;
import java.util.LinkedList;

public class structures {
	
	
	public static void main(String[] args) {
		
		//ExemploArray();
		ExemploLink();
		
	}
	
	static void L() {
		System.out.println("");
	}

	static void ExemploArray() {
		

		ArrayList<String> carros = new ArrayList<>();
		carros.add("Fuke");
		carros.add("sp2");
		carros.add("ertios");
		carros.add("ferrari");
		carros.add("F1");
		
		System.out.println(carros.size());
		L();
		System.out.println(carros);
		L();
		System.out.println(carros.get(2));
		L();
		System.out.println(carros.getFirst());
		L();
		System.out.println(carros.getLast());
		
		carros.removeLast();
		L();
		System.out.println(carros.getLast());
		
		carros.remove("ferrari");
		L();
		System.out.println(carros.getLast());
		
		L();
		System.out.println(carros);
		
		carros.add(1, "Mclaren");
		L();
		System.out.println(carros);
		//coloca no 1 e joga o resto pra frente
		
		
		carros.set(2, "Kwid");
		L();
		System.out.println(carros);
		//substitui
		
			
	}
	static void ExemploLink() {
		
		LinkedList<String> carros = new LinkedList<String>();
		carros.add("Fusca");
		carros.addFirst("TL");
		carros.add(0,"sp2");
		
		System.out.println(carros.toString());
		
	}
	
	
}

