// �����������Ƕ���֪��ʲô��ִ��ʲô
// ͬһ���͵�ÿ���������в�ͬ����Ϊ

class DogSong{
	int size;
	String name;
	
	void bark(){
		if (size>60){
			System.out.println("woof  woof");
		} else if(size>14){
			System.out.println("ruff ruff");
		} else {
			System.out.println("yip yip");
		}
	}
}

class SongTestDrive{
	public static void main(String[] args){
		DogSong[] d = new DogSong[3];
		/*
			��Ӧ����㻨�Ķ���һ�¼���
			for (int i=0; i<d.length;i++){
				d[i] = new DogSong();
				d[i].size = (int)(Math.random)*100);
			}
		*/
		
		// д�������� Ȼ���������ò�ʹ��DogSong[]�����������뷽��
		SongTestDrive song = new SongTestDrive();
		
		song.forMakerObject(d);
		song.forDogSong(d);
	}
	
	void forMakerObject(DogSong[] d ){
		for (int i=0; i<d.length;i++){
			d[i] = new DogSong();
			d[i].size = (int)(Math.random()*100);
		}
	}
	void forDogSong(DogSong[] d){
		for (int i=0; i<d.length;i++){
			d[i].bark();
		}
	}
	
}