package oo2.ejercicio22;

public class Piedra extends Juego{

	public Resultado jugar(Juego otroJuego) {
		return otroJuego.jugarContraPiedra(this);
	}

	protected Resultado jugarContraPapel(Papel papel) {
		return Resultado.GANA;
	}

	protected Resultado jugarContraPiedra(Piedra piedra) {
		return Resultado.EMPATA;
	}

	protected Resultado jugarContraTijera(Tijera tijera) {
		return Resultado.PIERDE;
	}
	
	protected Resultado jugarContraLagarto(Lagarto lagarto) {
		return Resultado.PIERDE;
	}
	
	protected Resultado jugarContraSpock(Spock spock) {
		return Resultado.GANA;
	}


}
