package practice13.common;

import practice13.common.Item;

public class SuperHero extends Hero{
	public SuperHero() {
		SuperHero superhero=new SuperHero();
		Item equipment;


		public String getEquipment() {
	        return this.equipment;
	    }

	    public void setEquipment(int equipment) {
	        this.equipment = equipment;
	    }
	}
}


/*
 * ★ common.Heroクラスを継承した、common.SuperHeroクラスを作成してください
 * 	●HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
 *
 * フィールド
 * 		equipment	:	common.Item
 * メソッド
 * 		attackメソッドをオーバーライドし、
 * 		powerに加えて、additionalDamage分を加算した値としてください
 *
 * 		equipmentのアクセサ
 */