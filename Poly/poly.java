class poly{
	public static void done(){
		animal a[]=new animal[5];
		a[0]=new cat();
		a[1]=new tiger();
		a[2]=new sheep();
		a[3]=new dog();
		a[4]=new animal();

		for(int i=0;i<a.length;i++){
			a[i].who();
			a[i].eat();
			a[i].walk();
			a[i].space();
		}
	}
}

class animal{
	public void who(){
		System.out.println("i am an animal");
	}
	public void eat(){
		System.out.println("i eat meat");
	}
	public void walk(){
		System.out.println("i walk like a king of jungle");
	}
	public final void space(){
		System.out.println();
	}
}

class dog extends animal{
	public void who(){
		System.out.println("i am a dog");
	}
	public void walk(){
		System.out.println("i walk like there is no tomorrow");
	}
}

class cat extends animal{
	public void who(){
		System.out.println("i am a cat");
	}
	public void walk(){
		System.out.println("i walk slowly");
	}
}

class sheep extends animal{
	public void who(){
		System.out.println("i am a sheep");
	}
	public void walk(){
		System.out.println("i walk cautiously");
	}
}

class tiger extends animal{
	public void who(){
		System.out.println("i am a tiger");
	}
}