package oo2.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Twitter {

	private List<Usuario> usuarios;
	
	public Twitter() {
		this.usuarios = new ArrayList<Usuario>();	
	}
	
	public Usuario crearUsuario(String nombre) {
		Usuario user = new Usuario(nombre);
		this.usuarios.add(user);
		return user;
	}
	
	public void eliminarUsuario(Usuario usuario) {
		eliminarRetweets(usuario);
		usuario.eliminarTweets();
	}
	
	private void eliminarRetweets(Usuario user) {
	    this.usuarios.forEach(usuario -> {
	        List<Tweet> tweetsActualizados = usuario.getTweets().stream()
	            .filter(tweet -> !tweet.getUsuario().getNombre().equals(user.getNombre()))
	            .collect(Collectors.toList());
	        usuario.setTweets(tweetsActualizados);
	    });
	}
	
}
