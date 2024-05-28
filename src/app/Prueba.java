package app;

import modelo.Carta;
import modelo.Mazo;

public class Prueba {

	public static void main(String[] args) {
		
		System.out.println("Creando la baraja de cartas....");
		// Creando una baraja
		Mazo baraja = new Mazo();
		
		baraja.baraja();
		System.out.println("La baraja es"+baraja);

		Carta c1 = baraja.solicitarCarta();
		System.out.println("La carta es"+ C1);
		System.out.println("La baraja queda"+baraja);
	}catch (NoHayMasCartasException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
