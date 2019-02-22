/*
	从习题中的代码段中找出可用的并输出
	triangle 0, area = 4.0
	triangle 1, area = 10.0
	triangle 2, area = 18.0
	triangle 3, area = 28
	y = 4
*/
class Triangle{
	double area;
	int height;
	int length;
	
	public static void main(String[] args){
		Triangle[] ta = new Triangle[4];
		int x = 0;
		while(x<4){
			ta[x] = new Triangle();
			ta[x].height = (x+1)*2;
			ta[x].length = x+4;
			ta[x].setArea();
			System.out.println("triangle " + x +", area" + " = " + ta[x].area);
			x++;
		}
		int y = x;
		x = 27;
		Triangle t5 = ta[2];
		// java中默认为int 这里做了隐式转换
		ta[2].area = 343;
		
		System.out.println("y = " + y + ",  t5 area = " + t5.area);
		
		// 隐式转换 取值范围第的转向高的 默认会使用取值范围高的bits
		int a = 13;
		float b ;
		b = a;
		System.out.print(b);
	}
	
	void setArea(){
		area = (height * length) / 2;
	}
	
}