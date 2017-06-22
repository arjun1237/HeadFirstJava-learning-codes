class Books{
	String title;
	String author;
}
class BookTest{
	public static void main(String args[]){
		
		Books myBooks[]=new Books[3];
		
		for(int i=0;i<myBooks.length;i++)
			myBooks[i]=new Books();
		
		myBooks[0].title="Java Beginners";
		myBooks[1].title="Coding Masters";
		myBooks[2].title="Java Coding";
		
		myBooks[0].author="Jammy";
		myBooks[1].author="Sandy";
		myBooks[2].author="Daniel";
		
		int x=0;
		while (x<3){
			System.out.println("The author of the book \""+myBooks[x].title+"\" is "+myBooks[x].author);
			x++;
		}
	}
}