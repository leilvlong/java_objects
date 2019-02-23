// java是通过值传递的 也就是说是通过拷贝传递的
// java作为强类型语言 任何时候都需要注意数据类型

public class MethodReturn {
		public static void main(String[] args) {
      		Dog d = new Dog();
			/*
			抛出异常 访问控制
				d.size = 10;
			*/
			d.setSize(70);
			d.setName("rui");
			d.bark();
			System.out.println(d.getSize());
			System.out.println(d.getName());
			
			// 新建一个对象 不传参数 获取他们会是什么呢
			Dog f = new Dog();
			System.out.println(f.getSize());
			System.out.println(f.getName());
			System.out.println(f.getList());
			/*
			int默认为 0  
			String 默认为null
			int[] 默认为[]
			联想到SongTestDrive中 局部变量的声明是没有默认值的 这是它们的区别
			方法的参数基本与局部变量相同,都是在方法中声明(准确来说是参数列声明)
			但参数并没有声明的问题,如果调用方法而没有传入参数才会抛出异常
			声明的局部变量也是如此,如果调用时没有初始化才会抛出异常
			*/
		}
	}

class Dog{
	// java封装
	// 私有的 只能通过方法获取
	private int size;
	private String name;
	private int[] list;
	
	public int getSize(){
		return size;
	}
	
	public void setSize(int s){
		size = s;
	}
	
	public String getName(){
		return name;
	}
	
	/*
	貌似没什么问题 但是需要注意的是这里的形参与实例变量同名
	传入实参时是传不进来的
	public void setName(String name){
		name = name;
	}
	*/
	
	public void setName(String na){
		name = na;
	}
	
	public int[] getList(){
		return list;
	}
	
	void bark(){
		if(size>60){
			System.out.println(name + " in woff!! woff!!");
		}else if(size>14){
			System.out.println(name + " in ruff!! ruff!!");
		}else{
			System.out.println(name + " in Yip!!   Yip!!");
		}
	}
}	