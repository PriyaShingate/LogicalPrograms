package Logical;

public class StringRemoveSpaces {
	public static void main(String[] args) {
		
		System.out.println("method 1");
		String str="My name is Priya";
		str=str.replaceAll(" "," ");//using inbuilt method
		System.out.println(str+"\n***********");
		
		///////////////////////////////////
		System.out.println("method 2");
		String star="j a v a";
		char chars[]=new char[star.length()];
		chars=star.toCharArray();
		String star1="";
		for (int i = 0; i < chars.length; i++) {
			if(chars[i]!=' ') {
				star1=star1+chars[i];
			}
		}
		System.out.println(star1+"\n*************");
		////////////////////////////
		System.out.println("method 3");
		String sa="P R I Y A";
		char[] ga=new char[sa.length()];
		ga=sa.toCharArray();
		String da="";
		//System.out.println(sa.length());
		for (int i = 0; i < sa.length(); i++) {
			if(ga[i]!=' ') {
				da=da+sa.charAt(i);
			}
			
		}
		System.out.println(da);
		
	}

}
