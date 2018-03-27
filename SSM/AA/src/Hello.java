/**
 * 在线学习平台 
 * 
 * Hello.java
 * 创建人:feng
 * 时间：2018/3/1-上午9:55:05 
 * 2018Tm公司-版权所有
 */

/**
 * 
 * Hello 创建人:feng 时间：2018/3/1-上午9:55:05
 * 
 * @version 1.0.0
 * 
 */
public class Hello {

	public static String reverse(String originStr) {
		if (originStr == null || originStr.length() <= 1) {
			return originStr;
		}
		return reverse(originStr.substring(1)) + originStr.charAt(0);
	}

	public static void mp(int a[]) {
		int swap = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[j] < a[i]) {
					swap = a[i];
					a[i] = a[j];
					a[j] = swap;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		Hello hello = new Hello();
		hello.reverse("12345");

	}

}
