class Island{
	public static void main(String args[]){
		String isl[]=new String[4];
		int indx[]=new int[4];
		int y=0;
		
		isl[0]="Bermuda";
		isl[1]="England";
		isl[2]="Sri Lanka";
		isl[3]="Fiji";
		
		indx[0]=1;
		indx[1]=3;
		indx[2]=0;
		indx[3]=2;
		
		int ref;
		while (y<4){
			ref=indx[y];
			System.out.println("Island: "+isl[ref]);
			y++;
		}
	}
}