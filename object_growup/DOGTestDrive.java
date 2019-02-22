/*
java 变量必须拥有类型以及名称并避开关键字(从我了解的编程语言里都有变量)
变量命名必须以字母 下划线 或$开头

*/
/*
class Dog{
	public static void main(String[] args){
		int g = 17;
		int y = g;
		y = y+10;
		short s;
		byte b = 3;
		byte v = b;
		short n = 12;
		int p = 3*g + y;
	}
}
*/

/*
堆与栈
堆区:
1.存储的全部是对象，每个对象都包含一个与之对应的class的信息。(class的目的是得到操作指令) 
2.jvm只有一个堆区(heap)被所有线程共享，堆中不存放基本类型和对象引用，只存放对象本身
3.动态分配内存(需要多少分配多少)

栈区:
1.每个线程包含一个栈区，栈中只保存基础数据类型的对象和自定义对象的引用(不是对象)，对象都存放在堆区中 
2.每个栈中的数据(原始类型和对象引用)都是私有的，其他栈不能访问。 
3.栈分为3个部分：基本类型变量区、执行环境上下文、操作指令区(存放操作指令)。

参考文献:
原文：https://blog.csdn.net/ToBeTheEnder/article/details/53258258 

*/

class Dog{
	int size;
	String breed;
	String name;
	
	void back(){
		System.out.println("ruff ruff!!");		
	}
}

class DogTestDrive{
	public static void main(String[] args){
		/*
			primitive数据变量的声明与赋值是开辟内存地址并指向(有些类似于 key:value)
				声明一个变量=变量空间的开辟
				变量的数据类型=这个空间要存储什么数据？
				变量名称=这个空间叫什么名字？
				变量的值=这个空间的第一次数据是什么？
			举个简单的例子;
				int a = 3;
				int b = a;
				编译器先处理int a = 3；首先它会在栈中创建一个变量为a的引用，
				然后查找有没有字面值为3的地址，没找到，就开辟一个存放3这个
				字面值的地址，然后将a指向3的地址。接着处理int b = a；在创建
				完b这个引用变量后，由于在栈中已经有3这个字面值，便将b直接指
				向3的地址。这样，就出现了a与b同时均指向3的情况。
				定义完a与b的值后，再令a = 4；那么，b不会等于4，还是等于3。
				在编译器内部，遇到时，它就会重新搜索栈中是否有4的字面值，
				如果没有，重新开辟地址存放4的值；如果已经有了，则直接将
				a指向这个地址。因此a值的改变不会影响到b的值	
		*/	
		
		/*
			对象只会存在可回收的垃圾堆上
			对象是无法直接访问的需要声明对象变量指向对象才可以访问(并没有实际包含,只是引用)
			引用对象变量会在栈中创建一个记录对象在堆所在的地址的引用
			实例化对象的过程将会在java的堆内存中形成一块存储对象类型所有实例数据值的结构化内存
			通过引用对象变量的栈内存地址所存储堆内存存储地址可以找到堆内存。 
			利用堆内存存的对象进行本地方法的调用,至于找到地址后的具体访问方式我暂时难以理解
			参考文献:	
			原文：https://blog.csdn.net/alvin_csdn_blog/article/details/78313996 
		*/
		
		/*
			总结:
				目前理解为java的变量本质上都是引用变量
				primitive数据类型变量是以字节来代表实际的变量值
				对象引用型变量则是以字节来表示取得对象的方法
		*/

		// 创建引用对象变量的三步: 1.声明变量 2.创建对象 3.连接对象和引用(变量)
		Dog d = new Dog();
		d.back();
		for (int i=0; i<9;i++){
			for(int y=0; y<i; y++){
				System.out.print("*");
			}
			System.out.println();
		}

		
	}
}


