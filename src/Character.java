public class Character {
	private String name;
	private int health;
public static void main(String[] args) {
	Character Max =new Character("Max", 50);
	System.out.println(Max.getName() + Max.getHealth());	
}
public void setName(String nm) {
	name = nm;
}
public String getName() {
	return name;
}
public void setHealth(int hl) {
	health = hl;
}
public int getHealth() {
	return health;
}
	public Character(String name, int health) {
	this.name = name;
	this.health = health;
	}
}

