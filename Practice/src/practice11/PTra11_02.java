package practice11;
/*
 * PTra11_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */


public class PTra11_02 {
	public static void main(String[] args) {

		// ★ ReadFileClassのクラスメソッドreadBookDataFile()を使い、本情報を取得します
		Book[] n = FileReaderClass.readBookDataFile();

		System.out.println("探したい本のタイトル（又はその一部）を入力してください");
		// ★ ユーザが入力した文字列が、本情報のタイトル一部に含まれていた場合は、その本情報を出力してください
		String nn = new java.util.Scanner(System.in).nextLine() ;

		for(int i=1;i<n.length;i++) {
			if(n[i].title.contains(nn)) {
				System.out.println(n[i].title);
				Book book = new Book(null, null, 0,0, null);
				book.title = nn;
				book.author = nn;
				book.price = i;
				book.pageSize = i;
				book.publication = nn;

				System.out.println(book.dispBookInfo());
			}
			}
		}
}