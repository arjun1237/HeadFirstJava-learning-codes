public class puzl{
	public static void main(String args[]){
		int x=0;
		int y=1;
		int result=0;
		useit p[]=new useit[6];
		while(x<6){
			p[x]=new useit();
			p[x].ivar=y;
			y=y*10;
			x++;
		}
		x=6;
		while(x>0){
			x--;
			result=result+p[x].doIt(x);
		}
		System.out.println("Result: "+result);		
	}
}

class useit{
	int ivar;
	public int doIt(int factor){
		if(ivar>100)
			return ivar*factor;
		else
			return ivar*(5-factor);
	}
}