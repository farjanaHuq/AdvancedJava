package lesson.seven;

public class Monster {
    public final String TOMBSTONE = "HERE LIES A DEAD MONSTER";
    
    private int health = 500;
    int attack = 20;
    private int movement = 2;
    private int xPosition = 0;
    private int yPostion = 0;
    private boolean alive = true;
    
    String name = "Big Monster";
    
    
	public int getHealth() {
		return health;
	}
	public int getAttack() {
		return attack;
	}
	public int getMovement() {
		return movement;
	}
	
	public void setHealth(int decreaseHealth) {
		health = health - decreaseHealth;
		if(health < 0) {
			alive = false;
		}
	}
	public Monster(int newHealth, int newAttack, int newMovement) {
		this.health = newHealth;
		this.attack = newAttack;
		this.movement = newMovement;
	}
	//Default Constructor
	public Monster() {}
	
	public static void main(String args[]) {
		Monster Frank = new Monster();
		System.out.println(Frank.attack);
	}
	
}
