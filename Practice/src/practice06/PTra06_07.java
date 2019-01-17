package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * 		i jjjj
		 * □□□□□1 2345
		 * ■□□□□2
		 * ■■□□□3
		 * ■■■□□4
		 * ■■■■□5
		 * ■■■■■1 2345
		 * ■■■■□2
		 * ■■■□□3
		 * ■■□□□4
		 * ■□□□□5 2345
		 */
		 for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	            	if(j<i) {
	            		 System.out.print("■");
	            	}else {
	                System.out.print("□");
	            	}
	            }
	            System.out.println();
		 }
		 for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	            	if(j<5-i){
	            		 System.out.print("■");
	            	}else {
	            		System.out.print("□");
	            	}
	            }
	            System.out.println();
		 }
	}
}