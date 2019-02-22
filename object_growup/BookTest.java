/*
对象引用:
	对象引用相当于是个遥控器,并且可以被设定用来控制不同的对象
	但这不是说在运行期也能控制不同的对象,对象引用被声明成什么
	就是什么,如果是个Dog对象,就不能引用到Dog以外的事物,但是可
	以去引用另外一个Dog,只要是Dog就行,因为可以被转换,就像重新
	设定遥控器,
	对象引用如果引用到空指针就会是个null
	
*/

/*
	栈：存放基本类型的数据和对象的引用，但对象本身不存放在栈中，而是存放在堆中
		在函数中定义的一些基本类型的变量数据和对象的引用变量都在函数的栈内存中分配。
		当在一段代码块定义一个变量时，Java就在栈中为这个变量分配内存空间，
		当该变量退出该作用域后，Java会自动释放掉为该变量所分配的内存空间，
		该内存空间可以立即被另作他用。
	
	堆：存放用new产生的数据
		堆内存用来存放由new创建的对象和数组。 在堆中分配的内存，由Java虚拟机的自动垃圾回收器来管理
*/
class BookTest{
	public static void main(String[] args){
		
		//声明两个引用变量 现在有两个引用数 两个对象
		Book a = new Book();
		Book b = new Book();
		
	/*
		声明新的引用变量 但是不创建新的对象 
		而是将引用变量a的字节组合拷贝给 引用变量c
		现在有三个引用 两个对象(原先的一个对象有了两个遥控器)
		打印结果 a 与 c一致
		Book c = a;
	
		a.book();
		c.x = 2;
		System.out.println("a.x: " + a.x);
		
		b.book();
		System.out.println("b.x: " + b.x);
		
		c.book();
		System.out.println("c.x: " + c.x);
	*/
		
	/*
		打印结果 c.x = 10 而 a 与 b 一致 等于15
		一旦引用变量更换了对象便与之前的对象没有了任何关系
	
		a.x = 10;
		b.x = 20;
		Book c = a;
		a = b;
		a.x = 15;
		
		a.book();
		System.out.println("a.x: " + a.x);
		
		b.book();
		System.out.println("b.x: " + b.x);
		
		c.book();
		System.out.println("c.x: " + c.x);
	*/
	/*
		a 原先引用的对象没有引用后会被回收
		a = b;
	*/
	}
}


class Book{
	int x = 0;
	void book(){
		System.out.println("...");
	}
}