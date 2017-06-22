class getset{
	int x;
	int getCharge(){
		return x*2;
	}
	void setCharge(int y){
		x=y;
	}
	public static void main(String args[]){
		getset a=new getset();
		System.out.println("Before: "+a.getCharge());
		a.setCharge(4);
		System.out.println("After: "+a.getCharge());
	}
}