// 找出代码其问题并解决
class Took{
	String title;
	String author;
}

class TookTestDrive{
	public static void main(String[] args){
		// 一个数组对象 用来放对象
		Took[] t = new Took[3];
		
		// 循环创建对象
		for(int i=0;i<t.length;i++){
			t[i] = new Took();
		}
		
		//在使用时需要先创建并引用对象
		t[0].title = " The grapes of java";
		t[1].title = " The java gatsby";
		t[2].title = " The java gatsby";
		t[0].author = "bob";
		t[1].author = "sue";
		t[2].author = "ian";
		int x = 0;
		while(x<3){
			System.out.println(t[x].title);
			System.out.print(" by ");
			System.out.println(t[x].author);
			x++;
		}
	} 
}