class Shuffle{
	public static void main(String args[]){
		int x=3;
		while (x>0){
			if (x>2)
				System.out.print("\na");
			System.out.print("-");
			x=x-1;
			if (x==2)
				System.out.print("b c");
			if (x==1){
				System.out.print("d\n");
				x=x-1;
			}
		}
	}
}