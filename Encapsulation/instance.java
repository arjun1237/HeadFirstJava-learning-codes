class check{
	private int x;
	private double y;
	private boolean see;
	private String name;
	private char c;
	private check inst;
	private int[] a;
	
	public int getInt(){
		return x;
	}
	public double getDouble(){
		return y;
	}
	public boolean getBoolean(){
		return see;
	}
	public String getString(){
		return name;
	}
	public char getChar(){
		return c;
	}
	public check getCheck(){
		return inst;
	}
	public int[] getArray(){
		return a;
	}
	
	public static void main(String args[]){
		check cd=new check();
		System.out.println("int ka ?:     "+cd.getInt());
		System.out.println("double  ka ?: "+cd.getDouble());
		System.out.println("boolean ka ?: "+cd.getBoolean());
		System.out.println("String ka ?:  "+cd.getString());
		System.out.println("Char ka ?:    "+cd.getChar());
		System.out.println("refc ka ?:    "+cd.getCheck());
		System.out.println("array ka ?:   "+cd.getArray());
	}
}