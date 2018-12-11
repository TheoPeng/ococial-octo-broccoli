package Array;

/**
 * ���һ�������ÿһ���������ϵ����µĶԽ����Ͼ�����ͬԪ�أ�
 * ��ô����������������ľ���
 * ����һ��M*N�ľ��󣬵��ҽ��������������ľ���ʱ����True��
 * @author Administrator
 *
 */
public class ToeplitzMatrix {
	
	private static boolean isToeplitzMatrix(int[][] matrix) {
		boolean isToeplitzMatrix = true;
		for(int i=1;i<matrix.length;i++) {
			for(int j=1;j<matrix[i].length;j++) {
				if(matrix[i][j]!=matrix[i-1][j-1]) {
					isToeplitzMatrix = false;
				}
			}
		}
		return isToeplitzMatrix;
	}

	public static void main(String[] args) {
		int[][] matrix = {
			{2, 2},
			{2, 2}
		};
		boolean isToeplitzMatrix = isToeplitzMatrix(matrix);
		System.out.println(isToeplitzMatrix);
//		int[] diagonalLength = generateDiagonalLength(matrix);
//		System.out.println(Arrays.toString(diagonalLength));
	}

}
