// ������һ��java����
// �಻�Ƕ��� �����������������ͼ
// �����ʱ ����ʱ�����ģ�����������
// ��������֪������ �����ִ�еĶ���
class First_object{
	int size;	   //ʵ������ ��������ʱ��֪������
	String breed;  //
	String name;   //
	
	// ���󱻴���ʱ��ִ�еĶ���: ����
	void bark(){
		System.out.print(name + "in ruff! ruff!");
	}
}

class First_objectTest{
	public static void main(String[] args){
		// �������� 
		First_object dog = new First_object();
		
		// ������֪������(ʵ������)
		dog.size = 40;
		dog.name = "��ë";
		
		//����ִ�еĶ���(����)
		dog.bark();
	}
}

// ��python��������������ͬ,ϸ���ϲ�ͬһʱ˵������
//class Dog:
//    # ��̬����
//    size = 20
//    
//    # ˽�о�̬���� ֻ�������䱾����������з���
//	  _���� = ֵ
//    
//    __���� = ֵ  ֻ����������౾����з���
//
//
//   def __init__(self,name,sex, **kwargs):
//       self.name = name
//        self.sex = sex
//        self.kwargs = kwargs
//
//    def run_dog(self):
//        print(self.name, "һֱ�ڽ�")
//        print(self.name,"���Ա���", self.sex)
//        print("��ֻ%s��������%s"%(self.name, self.kwargs.get('age', "��������û�и������ǹ������������Ϣ")))
// 
//	  # ˽�з���
//    def _arrr(self):
//         print("aa")
//
//
//ls = Dog(name='��ë', sex="ĸ��", age=18)
//ls.run_dog()
//
//pl = Dog(name='����', sex="����")
//pl.run_dog()