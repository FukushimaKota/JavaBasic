/*
 * PTra17_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice17.ptra17;

import java.io.IOException;

import practice17.common.ThrowExceptionUtil;

public class PTra17_03 {
	public static void main(String[] args) {
		quiz();
	}

	public static void quiz() {
		final String[] question = {
				"Javaの予約語となっている単語は次のうちどれか。\n1:static\t2:Sample\t3:java",
				"次の中からMicrosoftの製品はどれか。\n1:GitHub\t2:サクラエディタ\t3:SQL Server", "Javaが誕生した年は？（西暦で答えなさい）"
		};
		final int[] answer = { 1, 3, 1995 };

		int score = 0;

		System.out.println("クイズを始めます");

		/*
		 * ここから、例外処理を含めたプログラムになっています。
		 *
		 * ★入力された値が、数字以外であった場合、
		 * 「回答を数字で入力してください」
		 * から再度入力を求めるような形に仕様変更してください。
		 *
		 */


for (int i = 0; i < question.length; i++) {
	System.out.println("問題：" + (i + 1));
	System.out.println(question[i]);

	int num = -1;
	while (true) {
		System.out.println("回答を数字で入力してください");
		try {
			String input = ThrowExceptionUtil.inputValue();
			num = Integer.parseInt(input);

		} catch(IOException e) {
			System.out.println("例外が発生しました");
			continue;
		} catch(NumberFormatException e) {
			System.out.println("数字以外が入力されました");
			continue;
		}
		break;
	}

	if (answer[i] == num) {
		score++;
	}
}

System.out.println("全ての問題が終わりました。");
System.out.println("あなたの得点は・・・" + score + "点です！");}}

//
//		for (int i = 0; i < question.length; i++) {//3問終わるまで。
//
//			while (true) {//正しくなるまで。
//				System.out.println("問題：" + (i + 1));
//				System.out.println(question[i]);
//
//				try {//errorが出る範囲で囲えば良い
//
//					System.out.println("回答を数字で入力してください");
//					String input = ThrowExceptionUtil.inputValue();//文字の時Error
//
//					int num = Integer.parseInt(input);
//
//					if (answer[i] == num) {
//						score++;
//
//					}break;//ここで止める
//
//
//				} catch (IOException e) {//Error時の処理
//					System.out.println("例外が発生しました");
//				} catch (NumberFormatException e) {
//					System.out.println("数字以外が入力されました");
//
//				}
//
//				System.out.println("全ての問題が終わりました。");
//				System.out.println("あなたの得点は・・・" + score + "点です！");
//			}
//
//		}
//	}
//}
