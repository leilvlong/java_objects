// 类锁描述的是对象知道什么与执行什么
// 同一类型的每个对象能有不同的行为
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
			我应该玩点花的锻炼一下技巧
			for (int i=0; i<d.length;i++){
				d[i] = new DogSong();
				d[i].size = (int)(Math.random)*100);
			}
		*/
		
		// 写两个方法 然后用来调用并使用DogSong[]里对象的属性与方法
		SongTestDrive song = new SongTestDrive();
		
		// 批量制造DogSong对象
		song.forMakerObject(d);
		
		// 让它们都叫起来
		song.forDogSong(d);
		
		
		/*	
		创建DogSong数组对象时 可以直接调用方法批量制造对象
		但是当我写下这个例子时编译却抛出异常:  错误: 可能尚未初始化变量	
			DogSong b;
			song.makerNewDogSong(b);
			b.size = 78;
			b.bark();
		
		
		那么数组对象中应该是已经初始化过了 初始化的是什么呢 
		于是我在之前的数组对象批量创建对象时 输出System.out.println(d[0]); 得到:null
		对象数组中的每个元素装的都是null 
		于是我再次写下这个例子:
			DogSong b = null;
			song.makerNewDogSong(b);
			b.size = 78;
			b.bark();
		但是执行时抛出异常 Exception in thread "main" java.lang.NullPointerException at SongTestDrive.main
		仔细分析: System.out.println(Arrays.toString(d))
		d的值为 [null,null,null]  这些null是装在数组中,是有内存空间的 
		而b = null 是个空指针,没有内存空间
		*/
		
		/*
		虽然在调用方法时抛出的异常不同,但是本质上都是空指针
		只不过 b 骗过了编译器 
		c没有骗过 但是在执行时被抓出来了
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