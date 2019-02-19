import java.util.Arrays;
// 求数组最大值 在不调用任何方法的前提下
class Echo{
	public static void main(String[] args){
		// 获取数组最大值
		int[] listnumber = {66, 33, 44, 11, 22, 88, 15, 1,15,14};
		
		//遍历数组
		for(int i=0; i<listnumber.length; i++){
			
			//获取i遍历当前值与之前遍历过的每个都与之相比较
			// 根据需求进行从大到小排序
			// 交换赋值得出数组中每个数字应在的索引位置
			for(int y=0; y<i; y++){
				if(listnumber[i]>listnumber[y]){
					int temp = listnumber[i];
					listnumber[i]=listnumber[y];
					listnumber[y]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(listnumber));
		System.out.println("此数组最大值为:"+ listnumber[0]);
	}
}


// 踩了java数组的一个坑, 关于交换赋值上的 
// 使用了第三方库详细知道了错误的原因(没有使用ide工具)
// 使用python的后遗症 交换赋值被覆盖 数组的结果出现问题
// Python排序代码
/*
def gt_sort(target):
    for i in range(len(target)):
        for y in range(i):
            if target[i] > target[y]:
                target[i], target[y] = target[y], target[i]
    return target
*/