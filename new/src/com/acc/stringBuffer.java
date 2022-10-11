package com.acc;

public class stringBuffer {
	public static void main(String arg[]) {
		StringBuffer sb = new StringBuffer("accenture");
		System.out.println(sb);
		sb.insert(2, 'c');
		System.out.println(sb);
		StringBuffer test =sb .replace(0, 6, "trd");
		System.out.println(test);

	}

}
