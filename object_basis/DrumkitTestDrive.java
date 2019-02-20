/*
将打乱的代码排列好 并输出
bang bang ba-bang
ding ding da-ding
*/
class Drumkit{
	boolean topHat = true;
	boolean snare = true;
	void playSnare(){
		System.out.println("bang bang ba-bang" );
	}
	void playTohat(){
		System.out.print("ding ding da-ding");
	}
}

class DrumkitTestDrive{
	public static void main(String args[]){
		Drumkit d = new Drumkit();
		d.playSnare();
		d.playTohat();
		d.snare = false;
		if(d.snare == true){
			d.playSnare();
		}
	}
}
