package practice14.common;

public  class JavaCourse implements Course{
	/*
	 * ★ common.Courseを実装した、JavaCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】Java」
	 * 単元
	 * 		式と演算
	 * 		制御構文
	 * 		メソッド
	 * 		配列
	 * 		オブジェクト指向
	 * 		継承
	 * 		高度な継承
	 */

	public String getCourseName() {
		return PREFIX+"java";
	}
	public String[] getCourseUnit() {
		return new String[] {"式と演算","制御構文","メソッド","配列","オブジェクト指向","継承","高度な継承"};
	}
}
