/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */ArrayList<Player> array = new ArrayList<>();
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

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
	        //GK5  DF20  MF15 F W15 randomで

	        Collections.shuffle(array);

	        int gkCount = 0;
	        for(int i=array.size()-1;0<=i;i--) {
	     	   if(array.get(i).getposition().equals("GK")&&gkCount<1){
	     		   gkCount++;
	     		   System.out.println(array.get(i));
	     	   }
	        }
	        int dfCount = 0;
	        for(int i=array.size()-1;0<=i;i--) {
		     	   if(array.get(i).getposition().equals("DF")&&dfCount<4){
		     		   dfCount++;
		     		   System.out.println(array.get(i));
		     	   }
		        }
	        int mfCount = 0;
	        for(int i=array.size()-1;0<=i;i--) {
		     	   if(array.get(i).getposition().equals("MF")&&mfCount<4){
		     		   mfCount++;
		     		 System.out.println(array.get(i));
		     	   }
		        }
	        int fwCount = 0;
	        for(int i=array.size()-1;0<=i;i--) {
		     	   if(array.get(i).getposition().equals("FW")&&fwCount<2){
		     		   fwCount++;
		     		   System.out.println(array.get(i));
		     	   }
		        }
	}
}