package com.nitin.polymorphism;

public class Movie {
	private String movieName;

	public Movie(String movieName) {
		this.movieName = movieName;
	}
	public String plot() {
		return "No plot here";
	}
	
	public String getMovieName() {
		return movieName;
	}	

}

class Avengers extends Movie{
	
	public Avengers(String movieName) {
		super(movieName);
		
	}

	public String plot() {
		return "Action Movie of Hollywood";
	}
}

class StarGate extends Movie{
	
	public StarGate(String movieName) {
		super(movieName);
		
	}

	public String plot() {
		return "Sc-Fi movie to go one earth to another";
	}
}

class Terminator extends Movie{
	
	public Terminator(String movieName) {
		super(movieName);
		
	}

	public String plot() {
		return "Action Movie of Hollywood of Robots";
	}
}

class Rambo extends Movie{
	
	public Rambo(String movieName) {
		super(movieName);
		
	}

	public String plot() {
		return " Hollywood movie for Boxing";
	}
}

class FastAndFurious extends Movie{
	
	public FastAndFurious(String movieName) {
		super(movieName);
		
	}

	public String plot() {
		return " Hollywood movie for Boxing";
	}
}

class Speed extends Movie{
	
	public Speed(String movieName) {
		super(movieName);
		
	}

	@Override
	public String plot() {
		// TODO Auto-generated method stub
		return super.plot();
	}
	

	}


