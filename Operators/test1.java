class Foo{
	private int count;
	public static void main(String args[]){
		Foo a1=new Foo();
		Foo a2=new Foo();
		Foo a3=a1;
		a1.count=2;
		a2.count=2;
		if(a1==a2)
			System.out.println("a1=a2");
		if(a1==a3)
			System.out.println("a1=a3");
	}
}