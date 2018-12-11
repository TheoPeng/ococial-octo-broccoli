package Array;
/**
 * 给定一个矩阵A，返回A的转置矩阵。
 * 
 * 矩阵的位置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
 */
import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row = 0;
		int column = 0;
		while(true){
			System.out.println("请输入矩阵行数：");
			row = scan.nextInt();
			System.out.println("请输入矩阵列数：");
			column = scan.nextInt();
			if(row>=1&row<=1000&column>=1&column<=1000)
				break;
		}
		int[][] matrix = new int[row][column];
		for(int i=0;i<matrix.length;i++){
			System.out.println("请依次输入矩阵值：");
			for(int j=0;j<matrix[i].length;j++){
				matrix[i][j] = scan.nextInt();
			}
		}
		int[][] newMatrix = new int[column][row];
		for(int i=0;i<newMatrix.length;i++){
			for(int j=0;j<newMatrix[i].length;j++){
				newMatrix[i][j] = matrix[j][i];
			}
		}
		for(int i=0;i<newMatrix.length;i++){
			System.out.println(Arrays.toString(newMatrix[i]));
		}
		scan.close();
	}
}
