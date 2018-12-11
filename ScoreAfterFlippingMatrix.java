package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreAfterFlippingMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入矩阵行数：");
		int row = sc.nextInt();
		System.out.println("请输入矩阵列数：");
		int column = sc.nextInt();
		int[][] A = new int[row][column];
		for(int i=0;i<A.length;i++){
			System.out.println("请输入数据：");
			for(int j=0;j<A[i].length;j++){
				A[i][j] = sc.nextInt();
			}
		}
		int[][] A1 = new int[column][row];
		for(int i=0;i<A1.length;i++) for(int j=0;j<A1[i].length;j++) A1[i][j]=A[j][i];
		for(int i=0;i<A1.length;i++) System.out.println(Arrays.toString(A1[i]));
		String[] a = new String[row];
		int n;
		for(int i=0;i<A.length;i++){
			n = (int)(Math.random()*3);
			switch(n){
			case 0:for(int j=0;j<A[i].length;j++) A[0][j] = A[0][j]++%2;
			case 1:for(int j=0;j<A[i].length;j++) A[1][j] = A[1][j]++%2;
			case 2:for(int j=0;j<A[i].length;j++) A[2][j] = A[2][j]++%2;
			}
		}
		for(int i=0;i<A.length;i++){
			System.out.println(Arrays.toString(A[i]));
		}
		/*for(int i=0;i<A.length;i++){
			a[i] = Arrays.toString(A[i]);
			System.out.println(a[i]);
		}
		String[] a1 = new String[row];
		for(into i=0;i<a1.length;i++){
			a1[i] = Integer.valueOf(a[i],2).toString();
		}*/
		
	}
}
