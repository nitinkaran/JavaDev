package com.nitin.polymorphism;

public class Main {

	public static void main(String[] args ) {
		
 
		 for(int i=1; i<=10; i++) {
			 
			 Movie movie = randomMovie();
			 
			 System.out.println(  + i + ")" +  " Movie Name is : " + movie.getMovieName() + "\n" 
					 
			                                 + "movie plot : " + movie.plot() );
			 
			 System.out.println("----------------------------------------------------");
		 }	 
		
	}
	
	
	public static Movie randomMovie() {
		
		int random = (int) (Math.random()*6) + 1;
		System.out.println("random number is " + random);
		System.out.println("----------------------------------------------------");
		switch(random) {
		case 1: 
			return new Avengers("Avengers");
		
		case 2: 
			return	new StarGate("Stargate");
		
		case 3: 
			return new Terminator("Terminator");
		
		case 4:  
			return new Rambo("Rambo");
		
		case 5: 
			return new Speed("Speed");
		
		case 6: 
			return new FastAndFurious("FastAndFurious");
		
		
		}
		return null;
		
	}

}
