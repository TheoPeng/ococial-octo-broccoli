package Array;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 在MATLAB中，有一个非常有用的函数reshape，它可以将一个矩阵重塑
 * 为另一个大小不同的新矩阵，但保留其原始数据。
 * 给出一个由二维数组表示的矩阵，以及两个正整数r和c，分别表示想要的重构的矩阵的行数和列数。
 * 重构后的矩阵需要将原始矩阵的所有元素以相同的行遍历顺序填充。
 * 如果具有给定参数的reshape操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。
 * @author Administrator
 *
 */
public class ReshapeTheMatrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row = 0;
		int column = 0;
		while(true){
			System.out.println("请输入矩阵行数：");
			row = scan.nextInt();
			System.out.println("请输入矩阵列数：");
			column = scan.nextInt();
			if(row>=1&row<=100&column>=1&column<=100)
				break;
		}
		int[][] matrix = new int[row][column];
		for(int i=0;i<matrix.length;i++){
			System.out.println("请依次输入矩阵元素：");
			for(int j=0;j<matrix[i].length;j++){
				matrix[i][j] = scan.nextInt();
			}
		}
		int[] temp = new int[row*column];
		for(int i=0;i<matrix.length;i++){
			System.arraycopy(matrix[i], 0, temp, i*matrix[i].length, matrix[i].length);
		}
//		System.out.println(Arrays.toString(temp));
		
		int r = 0;
		int c = 0;
		while(true){
			System.out.println("请输入想要重构的矩阵的行数：");
			r = scan.nextInt();
			System.out.println("请输入想要重构的矩阵的列数：");
			c = scan.nextInt();
			if(r>0&c>0)
				break;
		}
		int[][] reshapedMatrix = new int[r][c];
		if(row*column==r*c){
			System.out.println("行遍历nums的结果是");
			for(int i=0;i<reshapedMatrix.length;i++){
				for(int j=0;j<reshapedMatrix[i].length;j++){
					reshapedMatrix[i][j] = temp[i*reshapedMatrix[i].length+j];
				}System.out.println(Arrays.toString(reshapedMatrix[i]));
			}
			System.out.println("新的矩阵是 "+r+" * "+c+" 矩阵，用之前的元素值一行一行填充新矩阵。");
		}else{
			for(int i=0;i<matrix.length;i++){
				System.out.println(Arrays.toString(matrix[i]));
			}
			System.out.println("没有办法将 "+row+" * "+column+" 矩阵转化为 "+r+" * "+c+" 矩阵。所以输出原矩阵。");
		}
		scan.close();
	}
}
