package practice13.common;

public class Employee extends Person{
	String departmentNm;
	int departmentCnt;

//
	public String getdepartmentNm() {
      return this.departmentNm;
  }
//departmentNm（部署名）
  public void setdepartmentNm(String departmentNm) {
      this.departmentNm = departmentNm;
  }

  public int getdepartmentCnt() {
      return this.departmentCnt;
  }
//departmentCnt（部署人数）
  public void setdepartmentCnt(int departmentCnt) {
      this.departmentCnt = departmentCnt;
  }

  public Employee(String departmentNm, int departmentCnt) {

  this. departmentNm= departmentNm;
  this. departmentCnt= departmentCnt;

  }}
/*
 * ★ common.Personクラスを継承して、common.Employeeクラスを作成してください
 *
 * フィールド
 * 		departmentNm（部署名）		:	String
 * 		departmentCnt（部署人数）	:	int
 * メソッド
 * 		各フィールドのアクセサ
*/