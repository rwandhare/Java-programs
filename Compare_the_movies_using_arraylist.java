package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Compare_the_movies_using_arraylist {

	public static void main(String[] args) {
	
		List<Movie> movies=new ArrayList<>();
		movies.add(new Movie("Furiosa",8));
		movies.add(new Movie("Deadpool",9));
		movies.add(new Movie("Alienoid",7));

		Collections.sort(movies);
		movies.forEach(m->System.out.println(m.getName()+" "+m.getRattings()));	
	
	}
}

class Movie implements Comparable<Movie>
	{
	 String name;
	 int rattings;
	 public String getName() {
		 return name;
	 }
	public void setName(String name) {
		this.name=name;
	}
	public int getRattings(){
		return rattings;
	}
	public void setRattings(int rattings) {
		this.rattings = rattings;
	}
	public Movie (String name, int rattings) {
		super();
		this.name=name;
		this.rattings=rattings;
	}
	@Override
	public int compareTo(Movie o) {
		if(o.getRattings()<this.getRattings())
			return 1;
		else if (o.getRattings()==this.getRattings())
			return 0;
		else
			return -1;	
	}
	
	}
