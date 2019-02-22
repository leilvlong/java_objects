/* 
Êä³ö
hello...
hello...
hello...
hello...
10
*/
public class EchoTestDrive{
	public static void main(String[] args){
		EchoTest e1 = new EchoTest();
		EchoTest e2 = new EchoTest();
		int x = 0;
		while (x<4){
			e1.hello();
			e1.cont += 1;
			System.out.println("e1 cont:" + e1.cont);
			if (x == 3){
				e2.cont += 1;
				System.out.println("if x == 3 e2.cont:" + e2.cont);
			}
			if (x > 0){
				System.out.println("if x > 0");
				e2.cont = e2.cont + e1.cont;
				System.out.println("e1 + e2"+ e2.cont);
			}
			System.out.println("x:" + x);
			x++;
		}
		System.out.println("e2.cont:"+e2.cont);
		
	}
}


/*
x = 0
e1.cont = 1
e2.cont = 0

x = 1
e1.cont = 2
e2.cont = 2
*/
class EchoTest{
	int cont = 0;
	void hello(){
		System.out.println("helloooo....");
	}
}