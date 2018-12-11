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
		String[] str = {"ƻ��","�㽶","��֦","��ݮ","����"};
		String result = arrayString(str);
		System.out.println("�ַ�����"+result.toString());
	}

}
