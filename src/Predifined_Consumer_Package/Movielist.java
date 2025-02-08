package Predifined_Consumer_Package;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class Movielist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Movie m = new Movie();
		Consumer<Movie>c = mv->{
			System.out.println("############################");
			System.out.println("Moive name : "+mv.getMoviename());
			System.out.println("Actor name : "+mv.getActor());
			System.out.println("Actress name : "+mv.getActress());
			System.out.println("############################");
		};
		ArrayList<Movie>list=m.populate();
		for(Movie mv:list) {
			c.accept(mv);
		}
		
	}

}
