import java.util.Arrays;


class Dog{
	String name;
	void bark(){
		System.out.println("ruff!! ruff!! ");
	}
	void eat(){
		//��ֱ�ӵ���ʵ������
		System.out.println(name + "  in eat");
	}
	void chaseCat(int num){
		System.out.println(name + " in chase " + num + " cats");
	}
} 

class ArrayObject{
	public static void main(String[] args){
		// ������һ��int�������ñ���(���int�����Ǹ����� �����ڶ���)
		int[] nums1;
		nums1 = new int[7];
		// int[] nums2 = new int[7];
		
		//Ϊ�������������Ԫ��
		for (int i=0; i < 7; i++){
			nums1[i] = (int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(nums1));
		
		// �����Ķ��� 
		Dog d = new Dog();
		d.name = "rui";
		d.eat();
		d.chaseCat(3);
		
		// Dog����װDog����?
		Dog[] pest = new Dog[7];
		for (int i=0; i < 7; i++){
			pest[i] = new Dog();
		}
		// �������л�ȡDog����
		pest[0].name = "akuya";
		pest[0].eat();
		
		// û�и�Dog����� name ��ֵ  �����Ǹ�null
		pest[1].eat();
		
		Dog e = new Dog();
		// ��ʱe �Ǹ�null ����Ȼ�������ñ�Ķ���
		e = null;
		
	}
}

/*
	�ظ�һ��֮ǰ�Ӵ����ص�:
		���������� primitive��������(�������) �� ���ñ���
		primitive���ݱ�����ֵ�����ֽڱ�ʾʵ�ʵ�ֵ
		���ñ�����ֵ�����ֽڱ�ʾ��λ�ڶ������ڵĶѵĴ洢����
		û�����õ��κζ�������ñ�����ֵΪnullֵ
		����Ҳ�Ƕ���

*/