public class PhraseGame{
	public static void main(String args[]){
		
		String list1[]={"24/7", "Multi Tier", "30,000 foot", "B2B", "Win-Win", "Front-end", "Web-based", "Pervasive", "Smart", "Six-Sigma", "Critical-Path", 
		"Dynamic"};
		
		String list2[]={"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "branded", "out-of-the-box", 
		"positioned", "networked", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated",};
		
		String list3[]={"process", "tipping", "point", "solution", "architecture", "core-competency", "startegy", "mindshare", "portal", "space", 
		"vision", "paradigm", "mission",};
		
		int len1= list1.length;
		int len2= list2.length;
		int len3= list3.length;
		
		int word1= (int) (Math.random()*len1);
		int word2= (int) (Math.random()*len2);
		int word3= (int) (Math.random()*len3);
		
		String phrase= list1[word1]+ " "+list2[word2]+ " "+list3[word3];
		
		System.out.println("\nWhat we need is a \""+phrase+"\".");
	}
}