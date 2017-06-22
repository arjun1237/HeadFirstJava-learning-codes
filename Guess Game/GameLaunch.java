class GameLaunch{
	public static void main(String args[]){
		GuessGame game=new GuessGame();
		game.startGame();
	}
}

class Player{
	int number;
	void play(){
		number=(int) (Math.random()*10);
	}
}

class GuessGame{
	Player p1;
	Player p2;
	Player p3;
	void startGame(){
		
		p1=new Player();
		p2=new Player();
		p3=new Player();
		
		int guess1=0;
		int guess2=0;
		int guess3=0;
		
		boolean isRight1=false;
		boolean isRight2=false;
		boolean isRight3=false;
		
		int target=(int) (Math.random()*10);
		
		System.out.println("\nThe target number is :"+target);
		
		while(true){
		     p1.play();
		     p2.play();
		     p3.play();
			 
			 guess1=p1.number;
			 guess2=p2.number;
			 guess3=p3.number;
			 
			 System.out.println("\nThe player 1 guess is :"+guess1);
			 System.out.println("The player 2 guess is :"+guess2);
			 System.out.println("The player 3 guess is :"+guess3);
			 
			 if(target==guess1)
				 isRight1=true;
			 if(target==guess2)
				 isRight2=true;
			 if(target==guess3)
				 isRight3=true;
			 
			 if(isRight1 || isRight2 || isRight3){
				 System.out.println("\nDid the player 1 get the guess right? :" +isRight1);
				 System.out.println("Did the player 1 get the guess right? :" +isRight2);
				 System.out.println("Did the player 1 get the guess right? :" +isRight3);
				 break;
			 }
			 else
				 System.out.println("\nNobody got it right, buddy. Keep trying \"HARD\"");
		}
	}
}


















