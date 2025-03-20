package oo2.ejercicio22;

public class Lagarto extends Juego{

	public Resultado jugar(Juego otroJuego) {
		return otroJuego.jugarContraLagarto(this);
	}

	protected Resultado jugarContraPapel(Papel papel) {
		return Resultado.PIERDE;
	}

	protected Resultado jugarContraPiedra(Piedra piedra) {
		return Resultado.GANA;
	}

	protected Resultado jugarContraTijera(Tijera tijera) {
		return Resultado.GANA;
	}
	
	protected Resultado jugarContraLagarto(Lagarto lagarto) {
		return Resultado.EMPATA;
	}
	
	protected Resultado jugarContraSpock(Spock spock) {
		return Resultado.PIERDE;
	}

}
