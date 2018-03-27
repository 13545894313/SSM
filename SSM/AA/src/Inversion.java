/**
 * 在线学习平台 
 * 
 * Inversion.java
 * 创建人:feng
 * 时间：2018/3/2-下午4:05:56 
 * 2018Tm公司-版权所有
 */

/**
 * 
 * Inversion
 * 创建人:feng 
 * 时间：2018/3/2-下午4:05:56 
 * @version 1.0.0
 * 
 */
public class Inversion {
	
	public static String inversion(String  inversion){
		
		if(inversion==null||inversion.length()<=1){
			return inversion;}
		//System.out.println(inversion.charAt(0));
		return inversion(inversion.substring(1))+inversion.charAt(0); 
	}
	
	
	public static void main(String[] args) {
		
//		Inversion inversion = new Inversion();
//		System.out.println(inversion.inversion("12345"));
		
		String str="ABCD";
		for (int i = str.length()-1; i >=0; i--) {
			str+=str.charAt(i);
		}
		System.out.println(str);
		str=str.substring(str.length()/2, str.length());
		System.out.println(str);
		
	}

}
