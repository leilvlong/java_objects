// �����������Ƕ���֪��ʲô��ִ��ʲô
// ͬһ���͵�ÿ���������в�ͬ����Ϊ
import java.util.Arrays;
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
		
		// ��������DogSong����
		song.forMakerObject(d);
		
		// �����Ƕ�������
		song.forDogSong(d);
		
		
		/*	
		����DogSong�������ʱ ����ֱ�ӵ��÷��������������
		���ǵ���д���������ʱ����ȴ�׳��쳣:  ����: ������δ��ʼ������	
			DogSong b;
			song.makerNewDogSong(b);
			b.size = 78;
			b.bark();
		
		
		��ô���������Ӧ�����Ѿ���ʼ������ ��ʼ������ʲô�� 
		��������֮ǰ���������������������ʱ ���System.out.println(d[0]); �õ�:null
		���������е�ÿ��Ԫ��װ�Ķ���null 
		�������ٴ�д���������:
			DogSong b = null;
			song.makerNewDogSong(b);
			b.size = 78;
			b.bark();
		����ִ��ʱ�׳��쳣 Exception in thread "main" java.lang.NullPointerException at SongTestDrive.main
		��ϸ����: System.out.println(Arrays.toString(d))
		d��ֵΪ [null,null,null]  ��Щnull��װ��������,�����ڴ�ռ�� 
		��b = null �Ǹ���ָ��,û���ڴ�ռ�
		*/
		
		/*
		��Ȼ�ڵ��÷���ʱ�׳����쳣��ͬ,���Ǳ����϶��ǿ�ָ��
		ֻ���� b ƭ���˱����� 
		cû��ƭ�� ������ִ��ʱ��ץ������
			DogSong b = null;
			DogSong c;
			System.out.println(b);
			System.out.println(b);
		*/
		
		
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
	
	DogSong makerNewDogSong(DogSong b){
		b = new DogSong();
		return b; 
	}  
	
}