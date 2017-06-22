class Bark2{
	void bark(int barks){
		while(barks>0){
			System.out.println("Bow! Bow!");
			barks--;
		}
	}
	void bark(String n, int barks){
		while(barks>0){
			System.out.println(n+" says \"Bow! Bow!\"");
			barks--;
		}
	}
	public static void main(String args[]){
		Bark2 doggy=new Bark2();
		doggy.bark(2);
		//System.out.println();
		doggy.bark("Sammy",10);
	}
}