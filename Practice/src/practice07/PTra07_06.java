package practice07;
/*
 * PTra07_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_06 {
	public static void main(String[] args) {

		// ★ ※2次元配列を用いています
		int[][] array = {
				{500,40,6},
				{70,8,90,1000}
		};
		int sum = array[0][0]+array[0][1]+array[0][2]+array[1][0]+array[1][1]+array[1][2]+array[1][3];

		int avg =sum / (array[0].length+array[1].length);
		// ★ 配列arrayに格納されている全ての数字の平均を出力してください
		System.out.println(avg);
	}
}

