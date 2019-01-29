package practice14.common;

import practice15.common.Course;

public class DBCourse implements Course{

	/*
	 * ★ common.Courseを実装した、DBCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】DB基礎」
	 * 単元
	 * 		DB基礎
	 * 		SQL基礎
	 * 		正規化
	 * 		SQL応用
	 *
	 *
	 */
	public String getCourseName() {
		return PREFIX + "DB基礎";
	}

	public String[] getCourseUnit() {
		return new String[]{"DB基礎","SQL基礎","正規化","SQL応用"};
	}
}
