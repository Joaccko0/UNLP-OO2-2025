package oo2.ejercicio22;

public abstract class Juego {
	
	public abstract Resultado jugar(Juego otroJuego);
	
	protected abstract Resultado jugarContraPapel(Papel papel);
	
	protected abstract Resultado jugarContraPiedra(Piedra piedra);
	
	protected abstract Resultado jugarContraTijera(Tijera tijera);
	
	protected abstract Resultado jugarContraLagarto(Lagarto lagarto);
	
	protected abstract Resultado jugarContraSpock(Spock spock);

}
