package Array;

import java.util.Scanner;
import java.util.Arrays;

public class FlippingAnImage {
	public static int[][] flipHorizontally(int[][] image) {
		for(int i=0;i<image.length;i++){
			for(int start=0,end=image[i].length-1;start<end;start++,end--){
				int temp = image[i][end];
				image[i][end] = image[i][start];
				image[i][start] = temp;
			}
		}
		return image;
	}
	public static int[][] invert(int[][] image) {
		for(int i=0;i<image.length;i++){
			for(int j=0;j<image[i].length;j++){
				if(image[i][j]==0){
					image[i][j] = 1;
				}else if(image[i][j]==1){
					image[i][j] = 0;
				}
			}
		}
		return image;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入图像大小：");
		int i = sc.nextInt();
		int j = sc.nextInt();
		int[][] image = new int[i][j];
		for(i=0;i<image.length;i++){
			System.out.println("请输入数据：");
			for(j=0;j<image[i].length;j++){
				image[i][j] = sc.nextInt();
			}
		}
		image = flipHorizontally(image);
		image = invert(image);
		System.out.println("翻转后的图像是：");
		for(i=0;i<image.length;i++){
			System.out.println(Arrays.toString(image[i]));
		}
		sc.close();
	}

}
