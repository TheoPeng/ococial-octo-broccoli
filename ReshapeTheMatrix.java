package Array;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * ��MATLAB�У���һ���ǳ����õĺ���reshape�������Խ�һ����������
 * Ϊ��һ����С��ͬ���¾��󣬵�������ԭʼ���ݡ�
 * ����һ���ɶ�ά�����ʾ�ľ����Լ�����������r��c���ֱ��ʾ��Ҫ���ع��ľ����������������
 * �ع���ľ�����Ҫ��ԭʼ���������Ԫ������ͬ���б���˳����䡣
 * ������и���������reshape�����ǿ����Һ���ģ�������µ����ܾ��󣻷������ԭʼ����
 * @author Administrator
 *
 */
public class ReshapeTheMatrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row = 0;
		int column = 0;
		while(true){
			System.out.println("���������������");
			row = scan.nextInt();
			System.out.println("���������������");
			column = scan.nextInt();
			if(row>=1&row<=100&column>=1&column<=100)
				break;
		}
		int[][] matrix = new int[row][column];
		for(int i=0;i<matrix.length;i++){
			System.out.println("�������������Ԫ�أ�");
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
			System.out.println("��������Ҫ�ع��ľ����������");
			r = scan.nextInt();
			System.out.println("��������Ҫ�ع��ľ����������");
			c = scan.nextInt();
			if(r>0&c>0)
				break;
		}
		int[][] reshapedMatrix = new int[r][c];
		if(row*column==r*c){
			System.out.println("�б���nums�Ľ����");
			for(int i=0;i<reshapedMatrix.length;i++){
				for(int j=0;j<reshapedMatrix[i].length;j++){
					reshapedMatrix[i][j] = temp[i*reshapedMatrix[i].length+j];
				}System.out.println(Arrays.toString(reshapedMatrix[i]));
			}
			System.out.println("�µľ����� "+r+" * "+c+" ������֮ǰ��Ԫ��ֵһ��һ������¾���");
		}else{
			for(int i=0;i<matrix.length;i++){
				System.out.println(Arrays.toString(matrix[i]));
			}
			System.out.println("û�а취�� "+row+" * "+column+" ����ת��Ϊ "+r+" * "+c+" �����������ԭ����");
		}
		scan.close();
	}
}
