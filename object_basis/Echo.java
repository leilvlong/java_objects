import java.util.Arrays;
// ���������ֵ �ڲ������κη�����ǰ����
class Echo{
	public static void main(String[] args){
		// ��ȡ�������ֵ
		int[] listnumber = {66, 33, 44, 11, 22, 88, 15, 1,15,14};
		
		//��������
		for(int i=0; i<listnumber.length; i++){
			
			//��ȡi������ǰֵ��֮ǰ��������ÿ������֮��Ƚ�
			// ����������дӴ�С����
			// ������ֵ�ó�������ÿ������Ӧ�ڵ�����λ��
			for(int y=0; y<i; y++){
				if(listnumber[i]>listnumber[y]){
					int temp = listnumber[i];
					listnumber[i]=listnumber[y];
					listnumber[y]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(listnumber));
		System.out.println("���������ֵΪ:"+ listnumber[0]);
	}
}


// ����java�����һ����, ���ڽ�����ֵ�ϵ� 
// ʹ���˵���������ϸ֪���˴����ԭ��(û��ʹ��ide����)
// ʹ��python�ĺ���֢ ������ֵ������ ����Ľ����������
// Python�������
/*
def gt_sort(target):
    for i in range(len(target)):
        for y in range(i):
            if target[i] > target[y]:
                target[i], target[y] = target[y], target[i]
    return target
*/