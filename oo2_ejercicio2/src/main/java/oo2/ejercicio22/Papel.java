package oo2.ejercicio22;

public class Papel extends Juego{

	public Resultado jugar(Juego otroJuego) {
		return otroJuego.jugarContraPapel(this);
	}

	protected Resultado jugarContraPapel(Papel papel) {
		return Resultado.EMPATA;
	}

	protected Resultado jugarContraPiedra(Piedra piedra) {
		return Resultado.PIERDE;
	}

	protected Resultado jugarContraTijera(Tijera tijera) {
		return Resultado.GANA;
	}
	
	protected Resultado jugarContraLagarto(Lagarto lagarto) {
		return Resultado.GANA;
	}
	
	protected Resultado jugarContraSpock(Spock spock) {
		return Resultado.PIERDE;
	}

}
