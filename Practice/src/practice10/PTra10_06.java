package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

import java.util.Scanner;

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

		Car[] cares;
		cares =new Car[3];

		Scanner scanner = new Scanner(System.in);

		for(int i=0;i<cares.length;i++) {
			System.out.println(i+1+"人目の情報を入力します");
			System.out.println("色,ガソリンをカンマ区切りで入力してください");

			String line = scanner.next();

			String[] n = line.split(",");

			cares[i]=new Car();

			int nn = Integer.parseInt(n[2]);

			cares[i].color =n[1];
			cares[i].gasolin =nn;
		}

			for(int i=0;i<cares.length;i++) {

			System.out.println("色"+cares[i].color);
			System.out.println("ガソリン"+cares[i].gasolin);
		}
	}
}

