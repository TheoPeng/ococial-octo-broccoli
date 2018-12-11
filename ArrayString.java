package Array;

public class ArrayString {
	
	public static String arrayString(String[] str)
	{
		if(str==null){
			return "";
		}
		
		StringBuilder sql = new StringBuilder();
		for(int i=0;i<str.length;i++){
			sql.append(str[i]+",");
		}
		
		String sub = str.toString().substring(0, sql.toString().length()-1);
		return sub;
	}

	public static void main(String[] args) {
		String[] str = {"Æ»¹û","Ïã½¶","ÀóÖ¦","²ÝÝ®","éÙ×Ó"};
		String result = arrayString(str);
		System.out.println("×Ö·û´®£º"+result.toString());
	}

}
