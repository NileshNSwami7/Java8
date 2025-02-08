package Predifined_Consumer_Package;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Consumer_chaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m = new Movie();
		ArrayList<Movie>list = m.populate();
		
		Consumer<Movie>c1 = c->System.out.println("Movie : "+c.getMoviename()+" is ready to release.");
		Consumer<Movie>c2 = c->System.out.println("Movie : "+c.getMoviename()+" Actor : "+c.getActor()+" Actress : "+c.getActress() );
		Consumer<Movie>c3 = c->System.out.println("Movie : "+c.getMoviename()+"is ready to storing.\n");
		
		Consumer<Movie> chaining = c1.andThen(c2).andThen(c3);
		for(Movie m1 : list) {
			chaining.accept(m1);
		}
		
	}

}
