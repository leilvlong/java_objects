// �ҳ����������Ⲣ���
class Took{
	String title;
	String author;
}

class TookTestDrive{
	public static void main(String[] args){
		// һ��������� �����Ŷ���
		Took[] t = new Took[3];
		
		// ѭ����������
		for(int i=0;i<t.length;i++){
			t[i] = new Took();
		}
		
		//��ʹ��ʱ��Ҫ�ȴ��������ö���
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