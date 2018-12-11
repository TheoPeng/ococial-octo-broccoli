package Array;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 给定一个非负整数numRows，生成杨辉三角的前numRows行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
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
