package Array;
/**
 * ����һ������A������A��ת�þ���
 * 
 * �����λ����ָ����������Խ��߷�ת���������������������������
 */
import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row = 0;
		int column = 0;
		while(true){
			System.out.println("���������������");
			row = scan.nextInt();
			System.out.println("���������������");
			column = scan.nextInt();
			if(row>=1&row<=1000&column>=1&column<=1000)
				break;
		}
		int[][] matrix = new int[row][column];
		for(int i=0;i<matrix.length;i++){
			System.out.println("�������������ֵ��");
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
