class Test{
	int giveaway(){
		return 42;
	}
	int giveaway(int b){
		return b*42;
	}
	void play(){
		int foo=34;
		double baa=42;
		Test t1=new Test();
		t1.arrange(foo,baa);
	}
	void arrange(int x,double y){
		double result=x+y;
		System.out.println("Result :"+result);
	}
	public static void main(String args[]){
		Test t=new Test();
		int a=t.giveaway();
		int c=t.giveaway(2);
		System.out.println(a+" "+c);
		t.play();
		int x=8;
		System.out.println("Value of x before: "+x);
		t.go(x);
		System.out.println("Value of x after: "+x);
	}
	void go(int z){
		System.out.println("Value of z before: "+z);
		z=0;
		System.out.println("Value of z after: "+z);
	}
}