/*
 * PTra16_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice16;

public class PTra16_02 {
	public static void main(String[] args) {

		boolean b = true;
		byte by = 100;
		short s = 300;
		char c = '日';
		int i = 1000;
		long l = 2000L;
		float f = 3.14F;
		double d = 453.592;

		System.out.println(b);
		System.out.println(by);

		// ★ 上記基本型を、それぞれのラッパークラスに代入してください
		java.lang.Boolean a1=new java.lang.Boolean(b);
		java.lang.Byte a2=new java.lang.Byte(by);
		java.lang.Short a3=new java.lang.Short(s);
		java.lang.Character a4=new java.lang.Character(c);
		java.lang.Integer a5=new java.lang.Integer(i);
		java.lang.Long a6=new java.lang.Long(l);
		java.lang.Float a7=new java.lang.Float(f);
		java.lang.Double a8=new java.lang.Double(d);

//		System.out.println(a1);
//		System.out.println(a2);
//		System.out.println(a3);
//		System.out.println(a4);
//		System.out.println(a5);
//		System.out.println(a6);
//		System.out.println(a7);
//		System.out.println(a8);
	}
}
