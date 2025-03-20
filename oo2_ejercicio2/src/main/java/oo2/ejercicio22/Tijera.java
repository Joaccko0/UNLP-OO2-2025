package oo2.ejercicio22;

public class Tijera extends Juego{

	public Resultado jugar(Juego otroJuego) {
		return otroJuego.jugarContraTijera(this);
	}

	protected Resultado jugarContraPapel(Papel papel) {
		return Resultado.PIERDE;
	}
	
	protected Resultado jugarContraPiedra(Piedra piedra) {
		return Resultado.GANA;
	}

	protected Resultado jugarContraTijera(Tijera tijera) {
		return Resultado.EMPATA;
	}
	
	protected Resultado jugarContraLagarto(Lagarto lagarto) {
		return Resultado.PIERDE;
	}
	
	protected Resultado jugarContraSpock(Spock spock) {
		return Resultado.GANA;
	}


}
