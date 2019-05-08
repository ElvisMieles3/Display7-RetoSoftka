package sofka.display7;

import sofka.display7.Numbers;

public class Index {

	public static void main(String[] args) {
		display7(2, 543);
	}
	
	public static void display7(int veces, int n) {
		String[] panel = new String[5];
		String stringDigits = Integer.toString(n);
		Numbers numeros = new Numbers();
		for(int j = 0; j < stringDigits.length(); j++) {
			switch(stringDigits.charAt(j)) {
			case '0':
				panel = agregarNumeroAPanel(panel, numeros.cero);
				break;
			case '1':
				panel = agregarNumeroAPanel(panel, numeros.uno);
				break;
			case '2':
				panel = agregarNumeroAPanel(panel, numeros.dos);
				break;
			case '3':
				panel = agregarNumeroAPanel(panel, numeros.tres);
				break;
			case '4':
				panel = agregarNumeroAPanel(panel, numeros.Cuatro);
				break;
			case '5':
				panel = agregarNumeroAPanel(panel, numeros.Cinco);
				break;
			case '6':
				panel = agregarNumeroAPanel(panel, numeros.Seis);
				break;
			case '7':
				panel = agregarNumeroAPanel(panel, numeros.Siete);
				break;
			case '8':
				panel = agregarNumeroAPanel(panel, numeros.Ocho);
				break;
			case '9':
				panel = agregarNumeroAPanel(panel, numeros.Nueve);
				break;
				
			}
		}
		
		for(int i = 0; i < veces; i++) {
			imprimirArreglo(panel);
		}
	}
	
	public static String[] agregarNumeroAPanel(String[] panel, String[] numero ) {
		for(int i = 0; i < numero.length; i++) {
			if(panel[i] != null) {
				panel[i] = panel[i] + numero[i];
			} else {
				panel[i] = numero[i];
			}
			panel[i] = panel[i]+" ";
		}
		return panel;
	}
	
	public static void imprimirArreglo(String[] arreglo) {
		for(int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
		System.out.println("");
	}

}
