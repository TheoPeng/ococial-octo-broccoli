package Array;

import java.util.Arrays;
import java.util.Scanner;
/**
 * ��������Ϊ2n�����飬��������ǽ���Щ���ֳ�n�ԣ�����(a1,b1),(a2,b2),...,(an,bn)��
 * ʹ�ô�1��n��min(ai,bi)�ܺ����
 * @author Administrator
 *
 */
public class ArrayPartitionI {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int len = 0;
		while(true){
			System.out.println("���������鳤�ȣ�");
			len = scan.nextInt();
			if(len%2==0)
				break;
		}
		int[] arr = new int[len];
		System.out.println("��������������Ԫ�أ�");
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
		System.out.println("n����"+n+"������ܺ�Ϊ"+sum);
		scan.close();
	}

}
