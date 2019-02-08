// 创建第一个java对象
// 类不是对象 是用来创建对象的蓝图
// 设计类时 对象时靠类的模型塑造出来的
// 对象是已知的事物 对象会执行的动作
class First_object{
	int size;	   //实例变量 创建对象时已知的事物
	String breed;  //
	String name;   //
	
	// 对象被创建时可执行的动作: 方法
	void bark(){
		System.out.print(name + "in ruff! ruff!");
	}
}

class First_objectTest{
	public static void main(String[] args){
		// 创建对象 
		First_object dog = new First_object();
		
		// 对象已知的事物(实例变量)
		dog.size = 40;
		dog.name = "金毛";
		
		//对象执行的动作(方法)
		dog.bark();
	}
}

// 与python的面向对象大致相同,细节上不同一时说不上来
//class Dog:
//    # 静态变量
//    size = 20
//    
//    # 私有静态变量 只能允许其本身与子类进行访问
//	  _属性 = 值
//    
//    __属性 = 值  只能允许这个类本身进行访问
//
//
//   def __init__(self,name,sex, **kwargs):
//       self.name = name
//        self.sex = sex
//        self.kwargs = kwargs
//
//    def run_dog(self):
//        print(self.name, "一直在叫")
//        print(self.name,"的性别是", self.sex)
//        print("这只%s的年龄是%s"%(self.name, self.kwargs.get('age', "它的主人没有告诉我们关于他年龄的信息")))
// 
//	  # 私有方法
//    def _arrr(self):
//         print("aa")
//
//
//ls = Dog(name='金毛', sex="母狗", age=18)
//ls.run_dog()
//
//pl = Dog(name='二哈', sex="公狗")
//pl.run_dog()