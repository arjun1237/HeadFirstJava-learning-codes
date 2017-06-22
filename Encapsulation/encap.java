class encap{
	private int size;
	private int[] test;
	
	public int[] testing(){
		test=new int[3];
		for (int i=0;i<test.length;i++)
			test[i]=i;
		return test;
	}
	
	public int getSize(){
		return size;
	}
	
	public void setSize(int s){
		size=s;
	}
	
	void bark(){
		if(size>70)
			System.out.println("Woof! Woof!");
		else if(size>30)
			System.out.println("Bow! Bow!");
		else if(size>10)
			System.out.println("Yip! Yip!");
		else
			System.out.println("Wrong size buddy! Try again!");
	}
	
	public static void main(String args[]){
		encap dog1=new encap();
		encap dog2=new encap();
		encap t1=new encap();
		encap pets[]=new encap[3];
		
		dog1.setSize(70);
		dog2.setSize(72);
		
		pets[0]=new encap();
		pets[1]=new encap();
		
		pets[0].setSize(12);
		pets[1].setSize(10);
		
		System.out.println("size of First Dog: "+dog1.getSize());
		dog1.bark();
		System.out.println("size of Second Dog: "+dog2.getSize());
		dog2.bark();
		System.out.println("size of third Dog: "+pets[0].getSize());
		pets[0].bark();
		System.out.println("size of fourth Dog: "+pets[1].getSize());
		pets[1].bark();
		
		int getArray[]=t1.testing();
		System.out.println("\ntesting: "+getArray[0]+" "+getArray[1]+" "+getArray[2]);
	}
}