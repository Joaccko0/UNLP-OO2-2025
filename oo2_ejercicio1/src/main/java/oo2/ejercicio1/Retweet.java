package oo2.ejercicio1;

public class Retweet extends Tweet{
	
	private Tweet esHijoDe;
	
	public Retweet(Tweet padre) {
		this.esHijoDe = padre;
	}

	@Override
	public String leerTweet() {
		return this.esHijoDe.leerTweet();
	}

	@Override
	public Usuario getUsuario() {
		return this.esHijoDe.getUsuario();
	}

}
