/*
 * PTra17_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice17.ptra17;

public class PTra17_04 {
	public static void main(String[] args) {

		String str = "スッキリわかるJava入門";

		slow(str,100) ;
	}
		/*
		 * ★ strに入っている文字列を1文字ずつゆっくり表示させるプログラムを完成させてください
		 * ※ Thread.sleep を使用すること
		 */
	public static void slow(String message, long millisecond) {//メソッド引数

			char[] n=message.toCharArray();//arrayにmessage

			for(int i=0;i<message.length();i++) {
				System.out.print(n[i]);
				try {
					Thread.sleep(millisecond);
				}catch(InterruptedException e) {
					System.out.print("Errorです");
				}
		}

	}
}