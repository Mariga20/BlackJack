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
}