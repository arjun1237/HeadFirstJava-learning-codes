class LetsBark{
	
	String name;
	int size;
	
	void bark(){
		if (size>60)
			System.out.println(name+" says Ruff! Ruff!");
		else if (size>30)
			System.out.println(name+" says Bow! Bow!");
		else
			System.out.println(name+" says Bu! Bu!");
	}
	
	public static void main(String args[]){
		
		LetsBark dog1=new LetsBark();
		dog1.name="Chimpu";
		dog1.size=128;
		
		LetsBark dog2=new LetsBark();
		dog2.name="Chamcha";
		dog2.size=60;
		
		LetsBark dog3=new LetsBark();
		dog3.name="Sillyman";
		dog3.size=30;
		
		dog1.bark();
		dog2.bark();
		dog3.bark();
	}
}