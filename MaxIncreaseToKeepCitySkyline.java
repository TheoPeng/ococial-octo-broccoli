package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MaxIncreaseToKeepCitySkyline {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] grid;
		int length,width;
		while(true){
			System.out.println("请输入城市大小：");
			length = sc.nextInt();
			width = sc.nextInt();
			if(length>1&width>1&length<=50&width<=50){
				break;
			}
		}
		grid = new int[width][length];
		for(int i=0;i<grid.length;i++){
			System.out.println("请依次输入建筑物高度：");
			for(int j=0;j<grid[i].length;j++){
				grid[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<grid.length;i++){
			System.out.println(Arrays.toString(grid[i]));
		}
		int[][] grid1 = new int[length][width];
		for(int i=0;i<length;i++){
			for(int j=0;j<width;j++){
				grid1[i][j] = grid[j][i];
			}
		}
		for(int i=0;i<grid1.length;i++){
			System.out.println(Arrays.toString(grid1[i]));
		}
		int[] max1 = new int[grid.length];
		for(int i=0;i<grid.length;i++){
			max1[i] = grid[0][0];
			for(int j=0;j<grid[i].length;j++){
				if(grid[i][j]>max1[i]){
					max1[i] = grid[i][j];
				}
			}
		}//System.out.println(Arrays.toString(max1));
		int[] max2 = new int[grid1.length];
		for(int i=0;i<grid1.length;i++){
			max2[i] = grid1[0][0];
			for(int j=0;j<grid1[i].length;j++){
				if(grid1[i][j]>max2[i]){
					max2[i] = grid1[i][j];
				}
			}
		}//System.out.println(Arrays.toString(max2));
		int[][] gridNew = new int[width][length];
		for(int i=0;i<gridNew.length;i++){
			for(int j=0;j<gridNew[i].length;j++){
				while(gridNew[i][j]<max1[i]&gridNew[i][j]<max2[j]){
					gridNew[i][j]++;
				}
			}
		}
		for(int i=0;i<gridNew.length;i++){
			System.out.println(Arrays.toString(gridNew[i]));
		}
		int sum = 0;
		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid[i].length;j++){
				sum += Integer.valueOf(gridNew[i][j]-grid[i][j]);
			}
		}System.out.println("建筑物高度可以增加的最大总和是"+sum+"。");
		sc.close();
	}

}
