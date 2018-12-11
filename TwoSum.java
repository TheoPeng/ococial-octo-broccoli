package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数组长度：");
		int n = sc.nextInt();
		if(n<=0){
			System.exit(0);
		}
		int[] nums = new int[n];
		int i = 0;
		while(i<n){
			System.out.println("请输入数组元素：");
			int num = sc.nextInt();
			nums[i] = num;
			i++;
		}
		System.out.println(Arrays.toString(nums));
			/*int[] nums = new int[n];
			for(int i=0;i<n;i++){
				System.out.println("请输入数组元素：");
				int num = sc.nextInt();
				nums[i] = num;
				System.out.println(Arrays.toString(nums));
			}*/
		System.out.println("请输入目标值：");
		int target = sc.nextInt();
		int[] num = new int[2];
		for(int j=0;j<nums.length;j++){
			for(int k=1;k<nums.length;k++){
				if(k==j)
					break;
				if(target==(nums[j]+nums[k])){
					num[0] = nums[j];
					num[1] = nums[k];
				}
			}
		}System.out.println(Arrays.toString(num));
		sc.close();
	}

}
