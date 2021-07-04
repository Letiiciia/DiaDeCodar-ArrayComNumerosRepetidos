import java.util.ArrayList;

public class Contagem {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(5);
		numeros.add(5);
		numeros.add(5);
		numeros.add(1);
		
		ArrayList<Integer> numeroRepetido = new ArrayList<Integer>();
	
		
		
		for(int i = 0; i < numeros.size(); i++) {
			for(int j = 1; j < numeros.size(); j++) {
				if(numeros.indexOf(i) == numeros.indexOf(j)) {
					
					numeroRepetido.add(numeros.indexOf(j));
				}
			}
			
			
		}

		System.out.println(numeroRepetido.size());
	}
}



	


