package Array;

/**
 * 如果一个矩阵的每一方向由左上到右下的对角线上具有相同元素，
 * 那么这个矩阵是托普利茨矩阵。
 * 给定一个M*N的矩阵，当且仅当它是托普利茨矩阵时返回True。
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
