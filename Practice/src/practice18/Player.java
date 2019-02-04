package practice18;

public class Player {
/*
 * ★ BestElevenCandidate.csvの情報を保持するためのクラス、entity.Playerクラスを作成してください
 *
 * フィールド
 * 		position	：	String
 * 		name		：	String
 * 		country		：	String
 * 		team		：	String
 * メソッド
 * 		各アクセサ
 *
 * 		toString()	：	Objectクラスのオーバーライド
 * 		各フィールドの値を、カンマ区切りの文字列で取得する
 */

public String position;
public String name;
public String country;
public String team;

public String getposition() {
   return this.position;
}
public void setposition(String position) {
   this.position = position;
}

public String getname() {
   return this.name;
}
public void setname(String name) {
   this.name = name;
   }

   public String getcountry() {
   return this.country;
}
public void setcountry(String country) {
   this.country = country;
   }

   public String getteam() {
   return this.team;
}
public void setteam(String team) {
   this.team = team;
   }

public String toString() {
    return "ポジション:"+this.position+",名前:"+this.name+",国:"+this.country+",チーム:"+this.team;
}

}