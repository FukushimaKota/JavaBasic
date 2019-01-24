package practice11;

public class PTra11_01 {
	public static void main(String[] args) {

		/*
		 * 以下のプログラムではコンパイルエラーが起きてしまいます
		 * ★ コンパイルが通るように修正してください(引数5つのコンストラクタを利用すること)
		 */
		Book book1 = new Book("スッキリわかるJava入門","中山清喬／国本大悟",2600,657,"インプレス");

		// 本の情報を出力します
		System.out.println(book1.dispBookInfo());

	}
}
		/*System.out.println("");

		Book book2 = new Book(null, null, 0, 0, null);
		book2.title = "スッキリわかるJava入門";
		book2.author = "中山清喬／国本大悟";
		book2.price = 2600;
		book2.pageSize = 657;
		book2.publication = "インプレス";

		// 本の情報を出力します
		System.out.println(book2.dispBookInfo());
	}
}*/