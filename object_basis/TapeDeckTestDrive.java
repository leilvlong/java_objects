/*
java习题 找出不能运行的原因并改好
class TapeDeck{
	boolean canRecord = false;
	void playTape(){
		System.out.println("tape playing");
	}
	void recordTape(){
		System.out.println("tape recording");
	}
}

class TapeDeckTestDrive{
	public static void main(String args[]){
		
		// 起初没有创建对象 所以下面的程序都无法运行
		TapeDeck t = new TapeDeck();
		
		t.canRecord = true;
		t.playTape();
		if (t.canRecord == true){
			t.recordTape();
		}
	}
}
*/

class TapeDeck{
	boolean canRecord = false;
	void recordDVD(){
		System.out.println("DVD recording ");
	}
	void playDVD(){
		System.out.println("DVD playding");
	}
}


class TapeDeckTestDrive{
	public static void main(String args[]){
		
		// 起初没有创建对象 所以下面的程序都无法运行
		TapeDeck d = new TapeDeck();
		
		d.canRecord = true;
		d.playDVD();
		if (d.canRecord == true){
			d.recordDVD();
		}
	}
}
