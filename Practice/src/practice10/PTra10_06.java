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

		for(int i=0;i<cares.length;i++) {
			System.out.println(i+1+"人目の情報を入力します");
			System.out.println("ナンバー,色,ガソリンをカンマ区切りで入力してください");

			Scanner scanner = new Scanner(System.in);

			String line = scanner.next();

			String[] n = line.split(",");

			cares[i]=new Car();

			int nnnn = Integer.parseInt(n[0]);
			int nnn = Integer.parseInt(n[2]);

			cares[i].serialNo=nnnn;
			cares[i].color =n[1];
			cares[i].gasolin =nnn;
		}

		final int distance = 300;


			for(int i=0;i<cares.length;i++) {

			System.out.println("ナンバー"+cares[i].serialNo);
			System.out.println("色"+cares[i].color);
			System.out.println("ガソリン"+cares[i].gasolin);
			System.out.println(" ");
		}



		for(int i=0;i<cares.length;i++) {
		int a =0;//進んだ合計用
		int aa=0;//ターン数用

		while (true) {
			int nn = cares[i].run();
			aa++;//ターン数

			if(nn==-1) {
				System.out.println(cares[i].serialNo+"車は目的地に到達できませんでした");
				break;
			}

			a=a+nn;//進んだ合計
			System.out.println(a);
			if(a>distance) {
				System.out.println(cares[i].serialNo+"車は、目的地にまで"+aa+"時間かかりました。残りのガソリンは、"+cares[i].gasolin+"リットルです");
				break;
				}
			}
		}
	}
}
//ちゃんと変数、定数の繋がりを覚えろ。