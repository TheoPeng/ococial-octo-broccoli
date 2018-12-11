package Array;

import java.util.Arrays;
import java.util.Scanner;
/**
 * ����һ���Ǹ�����numRows������������ǵ�ǰnumRows�С�
 * ����������У�ÿ�����������Ϸ������Ϸ������ĺ͡�
 * @author Administrator
 *
 */
public class PascalTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numRows = 0;
		while(true){
			System.out.println("numRows:");
			numRows = scan.nextInt();
			if(numRows>=0)
				break;
		}
		
		int[] temp = null;
		for(int i=0;i<numRows;i++){
			int[] pascal = new int[i+1];
			for(int j=0;j<pascal.length;j++){
				pascal[0] = 1;
				if(j!=0&j!=pascal.length-1){
					pascal[j] = temp[j-1] + temp[j];
				}
				pascal[pascal.length-1] = 1;
			}
			temp = new int[i+1];
			for(int j=0;j<temp.length;j++){
				temp[j] = pascal[j];
			}
			System.out.println(Arrays.toString(pascal));
		}
		scan.close();
	}

}
