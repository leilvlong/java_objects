public class EchoTestDrive{
	public static void main(String[] args){
		EchoTest e1 = nem EchoTest();
		int x = 0;
		while (x<4){
			e1.hello();
			EchoTest e2 = new Echotest();
			if (x<2){
				e2.cont += 1;
				System.out.println("ifx<2 e2的值为:" + e2);
			}
			if (x<3){
				e2.cont = e2.cont + e1.cont;
				System.out.println("if x < 3 e2的值为:" + e2);
				System.out.println("e1的值为:" + e2);

			}
		}
	}
}


/*
x = 0
cont = 0
cont = 1
cont = 1
x=1
cont = 1

*/
class EchoTest{
	int cont = 0;
	void hello{
		System.out.println("helloooo....")
	}
}