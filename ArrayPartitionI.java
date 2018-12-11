package Array;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 给定长度为2n的数组，你的任务是将这些数分成n对，例如(a1,b1),(a2,b2),...,(an,bn)，
 * 使得从1到n的min(ai,bi)总和最大。
 * @author Administrator
 *
 */
public class ArrayPartitionI {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int len = 0;
		while(true){
			System.out.println("请输入数组长度：");
			len = scan.nextInt();
			if(len%2==0)
				break;
		}
		int[] arr = new int[len];
		System.out.println("请依次输入数组元素：");
		for(int i=0;i<arr.length;i++){
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			if(i%2==0){
				sum += arr[i];
			}
		}
		int n = len/2;
		System.out.println("n等于"+n+"，最大总和为"+sum);
		scan.close();
	}

}
