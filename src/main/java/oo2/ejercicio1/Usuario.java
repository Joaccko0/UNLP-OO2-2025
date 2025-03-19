package oo2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String screenName;
	
	private List<Tweet> tweets;
	
	public Usuario(String screenName) {
		this.screenName = screenName;
		tweets = new ArrayList<Tweet>();
	}
	
	public Tweet twittear(String mensaje) {
		TweetOriginal tweet = new TweetOriginal(mensaje, this);
		this.tweets.add(tweet);
		return tweet;
	}
	
	public Tweet retwittear(Tweet tweet) {
		Retweet rt = new Retweet(tweet);
		this.tweets.add(rt);
		return rt;
	}
	
	public String getNombre() {
		return this.screenName;
	}
	
	public List<Tweet> getTweets() {
		return this.tweets;
	}
	
	public String leerTweet(Tweet tweet) {
		return tweet.leerTweet();
	}
	
	public String leerTweets() {
		int j = this.tweets.size();
		String str = "";
		for(int i = 0; i < j; i++) {
			str += this.tweets.get(i).leerTweet() + "\n";
		}
		return str;
	}
	
	public void eliminarTweets() {
		this.tweets.removeAll(tweets);
	}

	public void setTweets(List<Tweet> tweetsActualizados) {
		this.tweets = new ArrayList<Tweet>(tweetsActualizados);
	}
}
