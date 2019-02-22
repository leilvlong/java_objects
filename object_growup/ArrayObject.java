import java.util.Arrays;


class Dog{
	String name;
	void bark(){
		System.out.println("ruff!! ruff!! ");
	}
	void eat(){
		//可直接调用实例变量
		System.out.println(name + "  in eat");
	}
	void chaseCat(int num){
		System.out.println(name + " in chase " + num + " cats");
	}
} 

class ArrayObject{
	public static void main(String[] args){
		// 声明了一个int数组引用变量(这个int数组是个对象 生存于堆上)
		int[] nums1;
		nums1 = new int[7];
		// int[] nums2 = new int[7];
		
		//为这个数组对象添加元素
		for (int i=0; i < 7; i++){
			nums1[i] = (int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(nums1));
		
		// 正常的对象 
		Dog d = new Dog();
		d.name = "rui";
		d.eat();
		d.chaseCat(3);
		
		// Dog数组装Dog对象?
		Dog[] pest = new Dog[7];
		for (int i=0; i < 7; i++){
			pest[i] = new Dog();
		}
		// 从数组中获取Dog对象
		pest[0].name = "akuya";
		pest[0].eat();
		
		// 没有给Dog对象的 name 赋值  所以是个null
		pest[1].eat();
		
		Dog e = new Dog();
		// 此时e 是个null 但依然可以引用别的对象
		e = null;
		
	}
}

/*
	重复一下之前接触的重点:
		变量有两种 primitive数据类型(四类八种) 与 引用变量
		primitive数据变量的值是以字节表示实际的值
		引用变量的值是以字节表示的位于对象所在的堆的存储方法
		没有引用到任何对象的引用变量的值为null值
		数组也是对象

*/