public class Loopy{
	public static void main(String args[]){
		int x=1;
		System.out.println("");
		System.out.println("Before the Loop");
		System.out.println("");
		while(x<10){
			System.out.println("During the Loop - ");
			System.out.println("The value of x is "+x);
			System.out.println("");
			++x;
		}
		System.out.println("After the Loop");
	}
}