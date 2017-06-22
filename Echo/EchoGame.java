class TestEcho{
	public static void main(String args[]){
		int x=0;
		Echo e1=new Echo();
		Echo e2=new Echo();
		System.out.println("");
		while(x<4){
			e1.chill();
			e1.count=e1.count+1;
			if(x==3)
				e2.count=e2.count+1;
			if(x>0)
				e2.count=e2.count+e1.count;
			x++;
		}
		System.out.println(e2.count);
	}
}

class Echo{
	int count=0;
	void chill(){
		System.out.println("hello...!");
	}
}