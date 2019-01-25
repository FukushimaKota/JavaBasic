package practice13.common;

public class Item {
	String name;
	int additionalDamage;


	//name
	public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //additionalDamage
    public int getadditionalDamage() {
        return this.additionalDamage;
    }

    public void setadditionalDamage(int additionalDamage) {
        this.additionalDamage = additionalDamage;
    }

    Item(String name, int additionalDamage) {
    this.name = name;
    this.additionalDamage = additionalDamage;
    }
}
