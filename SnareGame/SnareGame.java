class DrumKit{
	boolean topHat=true;
	boolean snare=true;
	void playSnare(){
		System.out.println("\nbang bang ba-bang");
	}
	void playTopHat(){
		System.out.println("ding ding da-ding");
	}
}

class TestDrum{
	public static void main(String args[]){
		DrumKit d=new DrumKit();
		d.playSnare();
		d.snare=false;
		if(d.snare)
			d.playSnare();
		d.playTopHat();
	}
}