package oo2.ejercicio22;

public class Spock extends Juego{
	
	public Resultado jugar(Juego otroJuego) {
		return otroJuego.jugarContraSpock(this);
	}

	protected Resultado jugarContraPapel(Papel papel) {
		return Resultado.GANA;
	}

	protected Resultado jugarContraPiedra(Piedra piedra) {
		return Resultado.PIERDE;
	}

	protected Resultado jugarContraTijera(Tijera tijera) {
		return Resultado.PIERDE;
	}
	
	protected Resultado jugarContraLagarto(Lagarto lagarto) {
		return Resultado.GANA;
	}
	
	protected Resultado jugarContraSpock(Spock spock) {
		return Resultado.EMPATA;
	}

}
