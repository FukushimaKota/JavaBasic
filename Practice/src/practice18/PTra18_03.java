/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */

		ArrayList<Player> array = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
            	Player player =new Player();
                String line = scanner.nextLine();

                String[] n = line.split(",");

                player.position= n[0];
                player.name=n[1];
                player.country=n[2];
                player.team=n[3];

                array.add(player);
              }

        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください

       for(int i =array.size()-1;0<=i ; i--) {
    	   if(array.get(i).getteam().equals("レアル・マドリード")||array.get(i).getteam().equals("バルセロナ")) {
   		   array.remove(i);
    	   }
       }
//         ★ 削除後のArrayListの中身を全件出力してください
        for(Player soccer : array) {
        	System.out.println(soccer);
        }
	}
}