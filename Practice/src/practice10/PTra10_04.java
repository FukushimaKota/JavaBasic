package practice10;
import java.util.Scanner;

public class PTra10_04 {

	/*
	 * PTra10_01で作成したUserクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ User型の変数が3つ入る配列usersを宣言・確保してください
		User[] users;
		users =new User[3];
		// ★ java.util.Scannerクラスをインスタンス化し、変数scannerに代入してください
		Scanner scanner = new Scanner(System.in);

		// ★ usersのサイズ分繰り返す制御構文を記述してください
		//----------- ループ start
		for(int i=0;i<users.length;i++) {

			System.out.println(i+1+"人目の情報を入力します");		/* ##には、カウントを入れてください */
			System.out.println("ユーザID（数字）、 ユーザ名、メールアドレス、パスワードをカンマ区切りで入力してください");

			// ★ コンドプロンプトに入力された値を、String型の変数lineに格納してください
			String line = scanner.next();

			// ★ 変数lineに格納されている値を','で区切り、配列にしてください（Stringクラスのメソッドを使用します）
			String[] n = line.split(",");

			// ★ 配列にした値を、users[カウント]の各フィールドに代入してください
			// ★ ユーザIDに該当する値が数値でなかった場合は、エラーでプログラムが止まっても良いです
			users[i]=new User();

			int nn = Integer.parseInt(n[0]);

			users[i].userId =nn;
			users[i].userNm =n[1];
			users[i].mail =n[2];
			users[i].password =n[3];
		}
		//----------- ループ end

		// ★ usersに格納されている全てのインスタンスの、フィールドuserId, userNm, mail, passwordを出力してください
		for(int i=0;i<users.length;i++) {

		System.out.println("ユーザーId"+users[i].userId);
		System.out.println("名前"+users[i].userNm);
		System.out.println("メール"+users[i].mail);
		System.out.println("パスワード"+users[i].password);
		}
	}
}
