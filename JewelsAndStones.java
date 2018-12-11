package Array;

import java.util.Scanner;

public class JewelsAndStones {
	
	public static int search(String J, String S) {
		char[] jewels = J.toCharArray();
		char[] stones = S.toCharArray();
		int jewelNumber = 0;
		for(int i=0;i<stones.length;i++){
			for(int j=0;j<jewels.length;j++){
				if(stones[i]==jewels[j]){
					jewelNumber++;
				}
			}
		}
		return jewelNumber;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入石头中宝石的类型：");
		String J = sc.next();
		System.out.println("请输入你拥有的石头：");
		String S = sc.next();
		int jewNumber = search(J, S);
		System.out.println("你拥有的石头中有"+jewNumber+"个宝石。");
		sc.close();
	}

}
