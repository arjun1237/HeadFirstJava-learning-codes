class Movy{
	String title;
	String genre;
	int rating;
	void play(){
		System.out.println("\nPlaying the movie \""+title+"\" of genre "+genre+" and rating "+rating);
	}
}
class MovyTest{
	public static void main(String args[]){
		Movy m1=new Movy();
		m1.title="Gone with the wind...!";
		m1.genre="WILD WEST";
		m1.rating=3;
		
		Movy m2=new Movy();
		m2.title="Lost in Neverland";
		m2.genre="ADVENTURE";
		m2.rating=4;
		
		Movy m3=new Movy();
		m3.title="Kill Bill";
		m3.genre="ACTION COMEDY";
		m3.rating=2;
		
		m1.play();
	}
}