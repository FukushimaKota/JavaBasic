/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Employee;

public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = {"山田", "佐藤", "小林"};

	/** メールデータ（定数） */
	public static final String[] MAILDATA = {"yamada@hoge.com","satou@hoge.com","kobayashi@hoge.com"};

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = {"rezo0001","rezo0002","rezo0003"};

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
														{"総務部","業務部","システム部"},
														{"5","10","35"},
													};
	/**
	 * エントリーポイント
	 * @param args
	 */
	public static void main(String[] args) {

		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください
		Employee[] employees =new Employee[3];
//配列＋インスタンス
//繰り返し
		for(int i=0;i<employees.length;i++) {

			employees[i]=new Employee(null, i);

			employees[i].setUserNm(NAMEDATA[i]);
			employees[i].setMail(MAILDATA[i]);
			employees[i].setPassword(PASSDATA[i]);
			employees[i].setdepartmentNm(QUATERDATA[0][i]);
			employees[i].setdepartmentCnt(Integer.parseInt(QUATERDATA[1][i]));//唯一の数字

		}
		for(int i=0;i<employees.length;i++) {
		System.out.println(employees[i].getUserNm());
		System.out.println(employees[i].getMail());
		System.out.println(employees[i].getPassword());
		System.out.println(employees[i].getdepartmentNm());
		System.out.println(employees[i].getdepartmentCnt());
		}
		}

}
