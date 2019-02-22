class TestDrive{
	public static void main(String[] args){
		Test t1 = new Test();
		Test t2 = new Test();
		int x = 0;
		while(x<4){
			t1.hello();
			t1.count += 1;
			if(x==3){
				t2.count +=1;
				System.out.println("ifx == 3: " + t2.count);
			}
			if(x>0){
				t2.count += t1.count;
				System.out.println("if x > 0: " + t2.count);
			}
			x++;
		}
		System.out.println(t2.count);
	}
}


class Test{
	int count = 0;
	void hello(){
		System.out.println("hello....");
	}
}