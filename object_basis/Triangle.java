/*
	��ϰ���еĴ�������ҳ����õĲ����
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
		// java��Ĭ��Ϊint ����������ʽת��
		ta[2].area = 343;
		
		System.out.println("y = " + y + ",  t5 area = " + t5.area);
		
		// ��ʽת�� ȡֵ��Χ�ڵ�ת��ߵ� Ĭ�ϻ�ʹ��ȡֵ��Χ�ߵ�bits
		int a = 13;
		float b ;
		b = a;
		System.out.print(b);
	}
	
	void setArea(){
		area = (height * length) / 2;
	}
	
}