/*
javaϰ�� �ҳ��������е�ԭ�򲢸ĺ�
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
		
		// ���û�д������� ��������ĳ����޷�����
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
		
		// ���û�д������� ��������ĳ����޷�����
		TapeDeck d = new TapeDeck();
		
		d.canRecord = true;
		d.playDVD();
		if (d.canRecord == true){
			d.recordDVD();
		}
	}
}
