// java��ͨ��ֵ���ݵ� Ҳ����˵��ͨ���������ݵ�
// java��Ϊǿ�������� �κ�ʱ����Ҫע����������

public class MethodReturn {
		public static void main(String[] args) {
      		Dog d = new Dog();
			/*
			�׳��쳣 ���ʿ���
				d.size = 10;
			*/
			d.setSize(70);
			d.setName("rui");
			d.bark();
			System.out.println(d.getSize());
			System.out.println(d.getName());
			
			// �½�һ������ �������� ��ȡ���ǻ���ʲô��
			Dog f = new Dog();
			System.out.println(f.getSize());
			System.out.println(f.getName());
			System.out.println(f.getList());
			/*
			intĬ��Ϊ 0  
			String Ĭ��Ϊnull
			int[] Ĭ��Ϊ[]
			���뵽SongTestDrive�� �ֲ�������������û��Ĭ��ֵ�� �������ǵ�����
			�����Ĳ���������ֲ�������ͬ,�����ڷ���������(׼ȷ��˵�ǲ���������)
			��������û������������,������÷�����û�д�������Ż��׳��쳣
			�����ľֲ�����Ҳ�����,�������ʱû�г�ʼ���Ż��׳��쳣
			*/
		}
	}

class Dog{
	// java��װ
	// ˽�е� ֻ��ͨ��������ȡ
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
	ò��ûʲô���� ������Ҫע�����������β���ʵ������ͬ��
	����ʵ��ʱ�Ǵ���������
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