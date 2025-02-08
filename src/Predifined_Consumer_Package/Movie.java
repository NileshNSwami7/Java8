package Predifined_Consumer_Package;

import java.util.ArrayList;

public class Movie {
	
	private String moviename;
	private String actor;
	private String actress;
	public Movie() {
		super();
	}
	public Movie(String moviename, String actor, String actress) {
		super();
		this.moviename = moviename;
		this.actor = actor;
		this.actress = actress;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getActress() {
		return actress;
	}
	public void setActress(String actress) {
		this.actress = actress;
	}
	@Override
	public String toString() {
		return "Movie [moviename=" + moviename + ", actor=" + actor + ", actress=" + actress + "]";
	}
	
	
	public ArrayList<Movie> populate(){
		ArrayList<Movie>list = new ArrayList<>();
		list.add(new Movie("Bahubali","Prbhas","Anushka"));
		list.add(new Movie("R.Rajkumar","Shahid","Sonakshi"));
		list.add(new Movie("Boss","Akshay","Sonakshi"));
		list.add(new Movie("Jawan","KingKhan","Dipika"));
		list.add(new Movie("Tiger","Salman","Katrina"));

		return list;
	}
}
