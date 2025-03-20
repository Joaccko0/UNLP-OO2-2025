package oo2.ejercicio22;

public class Juego {
	
	public Juego() {
		
	}

	public String jugada(Opcion opcion1, Opcion opcion2) {
		if (opcion1.ganaVs(opcion2)) {
			return "Ganador: " + opcion1.getNombre(); 
		}
		else if(opcion2.ganaVs(opcion1)) {
			return "Ganador: " + opcion2.getNombre();
		}
		else return "Empate";
	}

}
