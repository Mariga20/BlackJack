package modelo;

import java.util.ArrayList;

public class Mano extends Mazo {

	public Mano() {
		//ceramos una list de cartas vacía
		this.cartas = new ArrayList<Carta>();
	}

	public int valorMano() throws Masde21Exception {
		int valor=0;
		int numAses=0;
		for(Carta c : this.cartas) {
			if (c.getNumero()==1) {
				numAses++;
			}
			valor = valor + c.getValor();
		}
		// comprobamos si me he pasado de 21
		if (numAses>0 && valor>21) {
			valor=valor-10;
			numAses--;
		}
		if(valor>20) {
			throw new Masde21Exception();
		}
		return valor;
	}
	//Versión del método que recoge la excepcionn para que no se 
	//propague  se devuelve true en cso de pasarnos de 21 puntos
	public boolean finDeJuego() {
		try {
			if(valorMano()>21) {
				return true;
			}
		} catch (Masde21Exception e) {
			return true;
		}
		return false;
	

		 
	 }

	@Override
	public String toString() {
		return "Mano [" + cartas + "]Valor de la mano:"+valorMano();
	}
	
	public void pedirCarta(Mazo baraja) {
		// Recoge la carta que se encuentra en el principio de Mazo
		Carta c = baraja.solicitarCarta();
		this.cartas.add(c);
		if (valorMano()>21) {
			throw new Masde21Exception();
		}
		if (valorMano()==21) {
			throw new HayBlackjackException();
		}
		}
	 
	
} 