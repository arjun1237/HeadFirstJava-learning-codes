class Dog{
	String name;
	public static void main(String args[]){
		Dog d=new Dog();
		d.bark();
		d.name="Fido";
		
		Dog myDogs[]=new Dog[3];
		myDogs[0]=new Dog();
		myDogs[1]=new Dog();
		myDogs[2]=d;
		
		myDogs[0].name="Finch";
		myDogs[1].name="Sundar";
		
		for(int i=0;i<myDogs.length;i++){
			myDogs[i].bark();
		}
		d.name="Sally";
		System.out.println();
		myDogs[2].bark();
	}
	
	void bark(){
		System.out.println(name+" is barking Bow Bow...!");
	}
}