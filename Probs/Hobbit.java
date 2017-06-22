class Hobbit{
	String name;
	public static void main(String args[]){
		Hobbit h[]=new Hobbit[3];
		int z=0;
		
		while(z<3){
			h[z]=new Hobbit();
			h[z].name="Tingo";
			if(z==1)
				h[z].name="Jammy";
			if(z==2)
				h[z].name="Rahul";
			System.out.println(h[z].name+" is a good Hobbit name.");
			z++;
		}
	}
}