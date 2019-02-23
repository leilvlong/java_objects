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
		而b = null 虽然是个null, 好吧 是我忘记接收返回值 导致的空指针
		*/
		
		// 这样就可以
		DogSong c = null;
		// 因为是有返回值的 所以需要接收 
		c = song.makerNewDogSong(c);
		c.bark();
		
		/*
		以下代码抛出异常 未初始化的变量 即未开辟内存空间的变量 
		java是通过值传递的 也就是说是通过拷贝传递的
		这样的变量在被赋值之前(哪怕是null)什么也做不了
			DogSong e;
			e = song.makerNewDogSong(e);
			e.bark();
			
		再来一个简单的例子:
			依然是抛出未初始化
			int a;
			System.out.print(a);
			a = a+1;
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
		b.size = 72;		
		return b; 
	}  
	
}