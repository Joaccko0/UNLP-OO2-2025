package oo2.ejercicio1;

public class TweetOriginal extends Tweet {
	
	private String mensaje;
	private Usuario autor;
	
	public TweetOriginal(String mensaje, Usuario autor) {
		this.mensaje = mensaje;
		this.autor = autor;
	}

	@Override
	public String leerTweet() {
		return this.mensaje;
	}

	@Override
	public Usuario getUsuario() {
		return this.autor;
	}
}

