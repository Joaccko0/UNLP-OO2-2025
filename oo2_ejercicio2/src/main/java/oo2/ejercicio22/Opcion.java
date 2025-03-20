package oo2.ejercicio22;

import java.util.ArrayList;
import java.util.List;

public abstract class Opcion {
	private String nombre;
	private List<Opcion> ganaContra;
	
	public Opcion(String nombre) {
		this.nombre = nombre;
		this.ganaContra = new ArrayList<Opcion>();
	}
	
	public void agregarGanaContra(Opcion opcion) {
		this.ganaContra.add(opcion);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public boolean ganaVs(Opcion op) {
		return this.ganaContra.contains(op);
	}
}

